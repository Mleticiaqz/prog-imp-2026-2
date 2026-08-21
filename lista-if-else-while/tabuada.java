import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Digite um número inteiro:");
    int num = input.nextInt();

    System.out.println("Tabuada do " + num + ":");

    int multiplicador = 1;
    while (multiplicador <= 10) {
        System.out.println(num + " x " + multiplicador + " = " + (num * multiplicador));
        multiplicador++;
    }

    input.close();
 }
}