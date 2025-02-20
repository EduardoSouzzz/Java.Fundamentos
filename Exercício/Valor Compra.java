import java.util.Scanner;

public class MinhaClass_6 {
    public static void main(String[] args) {

        // Valor Compra Maças

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de maças compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        if (quantidade < 12) {
            precoUnitario = 0.30;
        } else {
            precoUnitario = 0.25;
        }

        double valorTotal = quantidade * precoUnitario;
        System.out.println("o Valor da compra é: R$" + valorTotal);

        scanner.close();
    }
}
