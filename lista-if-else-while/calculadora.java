import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int num1 = input.nextInt();

    System.out.print("Digite outro número inteiro: ");
    int num2 = input.nextInt();

    int soma = num1 + num2;
    int subtracao = num1 - num2;
    int multiplicacao = num1 * num2;

    System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
    System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao);
    System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao);

    if (num2 != 0) {
        double divisao = (double) num1 / num2;
        System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao);
    } else {
        System.out.println("Divisão: Não é possível dividir por zero.");
    }

    input.close();

    }
}