
import java.util.Scanner;

public class CadastrarConta {

    public static final int TAM_CONTAS = 50;
    public static Scanner sc = new Scanner(System.in);

    public static class Conta {
        int id;
        String cliente;
        double saldo;
        double limite;
    }

    public static int buscaId(Conta[] v, int tam, int x) {

        for (int i = 0; i < tam; i++) {
            if (v[i].id == x) {
                return i;
            }
        }

        return -1;
    }

    public static int cadastrarConta(Conta[] v, int tam) {

        if (tam >= TAM_CONTAS) {
            System.out.println("Vetor cheio");
            return tam;
        }

        v[tam] = new Conta();

        System.out.println("Insira o id:");
        v[tam].id = sc.nextInt();

        if (buscaId(v, tam, v[tam].id) != -1) {
            System.out.println("Esse id ja existe");
            return tam;
        }

        sc.nextLine();

        System.out.println("Insira o nome:");
        v[tam].cliente = sc.nextLine();

        System.out.println("Insira o saldo:");
        v[tam].saldo = sc.nextDouble();

        System.out.println("Insira o limite:");
        v[tam].limite = sc.nextDouble();

        if (v[tam].saldo < 0 || v[tam].limite < 0) {
            System.out.println("Saldo ou limite invalido");
            return tam;
        }

        return tam + 1;
    }

    public static void main(String[] args) {

        Conta[] v = new Conta[TAM_CONTAS];

        int tam = 0;

        tam = cadastrarConta(v, tam);

        System.out.println("Total de contas: " + tam);
    }
}
