import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Digite um número que seja inteiro e positivo: ");
    int num = input.nextInt();

    if (num < 0) {
        System.out.println("Fatorial não é definido por números negativos");
    } 
    
    else {
        long fatorial = 1;
        int contador = num;

        while (contador > 1) {
            fatorial *= contador;
            contador--;
        }
        
    System.out.println("O fatorial de " + num + " é " + fatorial);

    }

    input.close();
 }
}