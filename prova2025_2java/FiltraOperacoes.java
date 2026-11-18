
public class FiltraOperacoes {

    public static final int TAM_OP = 1000;

    public static class Operacao {
        int id;
        int idConta;
        char tipo;
        double valor;
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

    public static void main(String[] args) {

        Operacao[] vOp = new Operacao[TAM_OP];
        Operacao[] vOpFiltrado = new Operacao[TAM_OP];

        vOp[0] = new Operacao();
        vOp[0].idConta = 10;

        vOp[1] = new Operacao();
        vOp[1].idConta = 20;

        vOp[2] = new Operacao();
        vOp[2].idConta = 10;

        int tam = filtraOperacoes(vOp, 3, vOpFiltrado, 10);

        System.out.println("Operacoes encontradas: " + tam);
    }
}
