import java.util.Scanner;

public class OperacoesCirculoEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da operação (1 - Perímetro do círculo, 2 - Área do círculo, 3 - Volume da esfera): ");
        int operacao = scanner.nextInt();

        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        final double PI = 3.141592;

        switch (operacao) {
            case 1:
                double perimetro = 2 * PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            case 2:
                double area = PI * raio * raio;
                System.out.println("Área do círculo: " + area);
                break;
            case 3:
                double volume = (4.0/3.0) * PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.out.println("Erro: Código da operação inválido.");
        }

        scanner.close();
    }
}