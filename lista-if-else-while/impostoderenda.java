import java.util.Scanner;

public class impostoderenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor do seu salário bruto em reais: ");
    double SalarioBruto = input.nextDouble();

    double contribuicaoINSS;

    if (SalarioBruto <= 1412.00) {
        contribuicaoINSS = SalarioBruto * 0.075;
    }

    else if (SalarioBruto <= 2666.68) {
        contribuicaoINSS = (SalarioBruto * 0.09) - 21.18;
    }

    else if (SalarioBruto <= 4000.03) {
        contribuicaoINSS = (SalarioBruto * 0.12) - 101.18;
    }

    else if (SalarioBruto <= 7786.02) {
        contribuicaoINSS = (SalarioBruto * 0.14) - 181.18;
    }

    else {
        contribuicaoINSS = 908.86;
    }

    double basecalculoImposto = SalarioBruto - contribuicaoINSS;
    double imposto;

    if (basecalculoImposto <= 2259.20) {
        imposto = 0.0;
    }

    else if (basecalculoImposto <= 2826.65) {
        imposto = (basecalculoImposto * 0.075) - 169.44;
    }

    else if (basecalculoImposto <= 4751.05) {
        imposto = (basecalculoImposto * 0.15) - 381.44;
    }

    else if (basecalculoImposto <= 4664.68) {
        imposto = (basecalculoImposto * 0.225) - 662.77;
    }

    else {
        imposto = (basecalculoImposto * 0.275) - 896.00;
    }

    if (imposto < 0) {
        imposto = 0.0;
    }

    double SalarioLiquido = SalarioBruto - contribuicaoINSS - imposto;

    System.out.printf("%nSalário bruto: R$ %.2f%n", SalarioBruto);
    System.out.printf("Contribuição ao INSS: R$ %.2f%n", contribuicaoINSS);
    System.out.printf("Base de cálculo imposto de renda: R$ %.2f%n", basecalculoImposto);
    System.out.printf("Imposto de renda retido na fonte: R$ %.2f%n", imposto);
    System.out.printf("Salário líquido (INSS + Imposto de Renda descontados): R$ %.2f%n", SalarioLiquido);

    input.close();

 }
}