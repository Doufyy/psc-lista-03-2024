import java.util.Scanner;

public class MaquinaDeVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();
        
        System.out.print("Digite o valor pago: R$");
        double valorPago = scanner.nextDouble();
        
        double troco = valorPago - valorCompra;
        
        if (troco < 0) {
            System.out.println("Valor pago é insuficiente. Por favor, insira mais dinheiro.");
            return;
        }
        
        int[] notas = {50, 20, 10, 5, 2, 1};
        System.out.println("Troco a ser dado: R$" + troco);
        System.out.println("Número de notas a serem dadas como troco:");
        
        for (int nota : notas) {
            int quantidade = (int) (troco / nota);
            if (quantidade > 0) {
                System.out.println("R$" + nota + ": " + quantidade);
                troco -= quantidade * nota;
            }
        }
        scanner.close();
    }
    
}
