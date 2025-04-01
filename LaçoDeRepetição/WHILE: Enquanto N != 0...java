import java.util.Scanner;

public class MinhaClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int soma = 0;
        while (a != 0) {
            soma = soma + a;
           a = scanner.nextInt();
        }
        System.out.println("SOMA: " + soma);

        scanner.close();
    }
}
