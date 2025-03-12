import java.util.Scanner;

public class MinhaClass_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lista de preços (o índice representa o código do item)
        double[] precos = {0.0, 4.00, 4.50, 5.00, 2.00, 1.50};

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        if (codigo >= 1 && codigo <= 5)  {
            double total = precos[codigo] * quantidade;
            System.out.printf("Total: R$ %.2f%n ", total);
        } else {
            System.out.println("Digite o codigo entre 1 e 5!");
        }

        scanner.close();
    }
}
