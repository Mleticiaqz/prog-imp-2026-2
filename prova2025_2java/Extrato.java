
import java.util.Scanner;

public class Extrato {

    public static final int TAM_OP = 1000;
    public static Scanner sc = new Scanner(System.in);

    public static class Conta {
        int id;
        String cliente;
        double saldo;
        double limite;
    }

    public static class Operacao {
        int id;
        int idConta;
        char tipo;
        double valor;
    }

    public static int buscaId(Conta[] v, int tam, int x) {

        for (int i = 0; i < tam; i++) {

            if (v[i].id == x) {
                return i;
            }
        }

        return -1;
    }

    public static int filtraOperacoes(Operacao[] vOp, int tamOp, Operacao[] vOpFiltrado, int x) {

        int tamOpF = 0;

        for (int i = 0; i < tamOp; i++) {

            if (vOp[i].idConta == x) {

                vOpFiltrado[tamOpF] = vOp[i];

                tamOpF++;
            }
        }

        return tamOpF;
    }

    public static void extrato(Conta[] vContas, int tamConta, Operacao[] vOp, int tamOp) {

        System.out.println("Insira o id da conta:");
        int id = sc.nextInt();

        int pos = buscaId(vContas, tamConta, id);

        if (pos == -1) {
            System.out.println("Conta nao encontrada");
            return;
        }

        Operacao[] vOpFiltrado = new Operacao[TAM_OP];

        int tamOpF = filtraOperacoes(vOp, tamOp, vOpFiltrado, id);

        int inicio = tamOpF - 5;

        if (inicio < 0) {
            inicio = 0;
        }

        double saldo = 0;

        for (int i = 0; i < inicio; i++) {
            saldo = saldo + vOpFiltrado[i].valor;
        }

        System.out.println("----------------------------------------");
        System.out.println("CONTA N." + id);
        System.out.println("CLIENTE: " + vContas[pos].cliente);
        System.out.println("----------------------------------------");

        System.out.println("ID | OPERACAO | VALOR | SALDO");

        char sinalAnterior = saldo >= 0 ? 'C' : 'D';

        System.out.printf("Saldo Anterior: %.2f%c%n",
                Math.abs(saldo), sinalAnterior);

        for (int i = inicio; i < tamOpF; i++) {

            saldo = saldo + vOpFiltrado[i].valor;

            String descricao = "";

            if (vOpFiltrado[i].tipo == 'D') {
                descricao = "Deposito";
            }

            if (vOpFiltrado[i].tipo == 'S') {
                descricao = "Saque";
            }

            if (vOpFiltrado[i].tipo == 'T') {
                descricao = "Transferencia";
            }

            char sinal = vOpFiltrado[i].valor >= 0 ? 'C' : 'D';

            char sinalSaldo = saldo >= 0 ? 'C' : 'D';

            System.out.printf("%04d | %-15s | %.2f%c | %.2f%c%n",
                    vOpFiltrado[i].id,
                    descricao,
                    Math.abs(vOpFiltrado[i].valor),
                    sinal,
                    Math.abs(saldo),
                    sinalSaldo);
        }

        char sinalAtual = saldo >= 0 ? 'C' : 'D';

        System.out.printf("Saldo Atual: %.2f%c%n",
                Math.abs(saldo), sinalAtual);

        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        Conta[] vContas = new Conta[50];
        Operacao[] vOp = new Operacao[TAM_OP];

        vContas[0] = new Conta();
        vContas[0].id = 1;
        vContas[0].cliente = "Maria";

        Operacao op = new Operacao();
        op.id = 25;
        op.idConta = 1;
        op.tipo = 'D';
        op.valor = 1000;

        vOp[0] = op;

        extrato(vContas, 1, vOp, 1);
    }
}
