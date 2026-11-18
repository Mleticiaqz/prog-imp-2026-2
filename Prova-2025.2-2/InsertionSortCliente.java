
public class InsertionSortCliente {

    public static class Conta {
        int id;
        String cliente;
        double saldo;
        double limite;
    }

    public static int insertionSortCliente(Conta[] v, int tam) {

        for (int i = 1; i < tam; i++) {

            Conta aux = v[i];

            int j = i - 1;

            while (j >= 0 && v[j].cliente.compareToIgnoreCase(aux.cliente) > 0) {

                v[j + 1] = v[j];

                j--;
            }

            v[j + 1] = aux;
        }

        return tam;
    }

    public static void main(String[] args) {

        Conta[] v = new Conta[3];

        v[0] = new Conta();
        v[0].cliente = "Maria";

        v[1] = new Conta();
        v[1].cliente = "Ana";

        v[2] = new Conta();
        v[2].cliente = "Carlos";

        insertionSortCliente(v, 3);

        for (int i = 0; i < 3; i++) {
            System.out.println(v[i].cliente);
        }
    }
}
