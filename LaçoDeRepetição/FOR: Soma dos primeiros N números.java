import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número N: ");

        int N = scanner.nextInt();

        int soma = 0;

        for ( int i = 1; i <= N; i++) {
            soma += i;
        }

        System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);
    }
}
