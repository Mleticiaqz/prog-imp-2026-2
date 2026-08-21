import java.util.Scanner;

public class pareimpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = input.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = input.nextInt();

    int inicio;
    int fim;

    if (num1 <= num2) {
        inicio = num1;
        fim = num2;
    } else {
        inicio = num2;
        fim = num1;
    }

    System.out.println("Números pares entre " + inicio + " e " + fim + ":");

    int atual = inicio;
    while (atual <= fim) {
        if (atual % 2 == 0) {
            System.out.print(atual + " ");
        }
        atual++;
    }

    System.out.println("Números ímpares entre " + inicio + " e " + fim + ":");

    atual = inicio;
    while (atual <= fim) {
        if (atual % 2 != 0) {
            System.out.print(atual + " ");
        }
        atual++;
    }
    
    System.out.println();
    input.close();
 }
}