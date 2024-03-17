import java.util.Scanner;
import java.util.Random;

public class SorteioParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Encontrar o menor e o maior número
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        // Realizar o sorteio entre o menor e o maior número
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numeroSorteado);

        // Verificar se o número sorteado é par ou ímpar
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado (" + numeroSorteado + ") é par.");
        } else {
            System.out.println("O número sorteado (" + numeroSorteado + ") é ímpar.");
        }

        scanner.close();
    }
}