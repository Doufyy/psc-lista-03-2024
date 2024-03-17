import java.util.Scanner;

public class Aritimetc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double num3 = scanner.nextDouble();

        double maiorNumero = Math.max(num1, Math.max(num2, num3));
        double menorNumero = Math.min(num1, Math.min(num2, num3));
        double aritimeticaMedia = (num1 + num2 + num3) / 3;

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);
        System.out.println("A média aritmética dos três números é: " + aritimeticaMedia);
        scanner.close();
    }
}