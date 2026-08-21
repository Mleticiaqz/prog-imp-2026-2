import java.util.Scanner;

public class calculodeIMC {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Digite seu peso (Ex: 72): ");

    float a = input.nextFloat();

    System.out.print("Digite sua altura (Ex: 1,80): ");

    float b = input.nextFloat();

    float c = a / (b * b);

    System.out.println("O seu IMC é: " + c);

    if (c < 18.5) {
        System.out.println("Magreza");
    }

    else if (c >= 18.5 && c <= 24.9) {
        System.out.println("Normal");
    }

    else if (c >= 25.0 && c <= 29.9) {
        System.out.println("Sobrepeso");
    }

    else if(c >= 30.0 && c <= 39.9) {
        System.out.println("Obesidade");
    }

    else if (c > 40.0) {
        System.out.println("Obesidade grave");
    }

    input.close();

  }
}