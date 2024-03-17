import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do coeficiente 'a': ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor do coeficiente 'b': ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor do coeficiente 'c': ");
        double c = scanner.nextDouble();
    
        double delta = b * b - 4 * a * c;
        
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Raiz real da equação: " + raiz);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
            double raiz = -b / (2 * a);
            System.out.println("Valor das raízes: " + raiz + ", " + raiz);
        } else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor das raízes: " + raiz1 + ", " + raiz2);
        }
        
        scanner.close();
    }
}