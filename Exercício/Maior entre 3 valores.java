import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calcula o maior entre a e b
        int maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Calcula o maior entre maiorAB e c
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");

        scanner.close();
    }
}
