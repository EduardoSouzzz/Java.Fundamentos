import java.util.ArrayList;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um produto " + (i + 1) + ": ");
            String produtoo = sc.nextLine();

            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            double precoProd = sc.nextDouble();
            sc.nextLine();

            System.out.println();

            Produto produto = new Produto(produtoo, precoProd);
            produtos.add(produto);

        }
        System.out.println("Produtos Cadastrados: ");
        for (Produto p : produtos) {
            System.out.println("Nome: " + p.getNome() + " | Preço R$: " + p.getPreco());

         }

        sc.close();
    }
}
