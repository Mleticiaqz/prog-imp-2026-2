
public class BuscaBinariaCliente {

    public static class Conta {
        int id;
        String cliente;
        double saldo;
        double limite;
    }

    public static int buscaBinariaCliente(Conta[] v, int tam, String x) {

        int inicio = 0;
        int fim = tam - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (v[meio].cliente.equalsIgnoreCase(x)) {
                return meio;
            }

            if (v[meio].cliente.compareToIgnoreCase(x) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Conta[] v = new Conta[3];

        v[0] = new Conta();
        v[0].cliente = "Ana";

        v[1] = new Conta();
        v[1].cliente = "Carlos";

        v[2] = new Conta();
        v[2].cliente = "Maria";

        int pos = buscaBinariaCliente(v, 3, "Maria");

        System.out.println("Posicao: " + pos);
    }
}
