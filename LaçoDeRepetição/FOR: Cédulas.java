import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {
        
        // Cédulas;
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Lê o valor inteiro
        System.out.println(N); // Imprime o valor lido

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = N / nota; // Quantidade de notas dessa denominação
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            N %= nota; // Atualiza o valor restante
        }

        sc.close();
    }
}
