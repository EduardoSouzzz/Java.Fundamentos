import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        // Senha Invalida?

        Scanner scanner = new Scanner(System.in);

        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");

        scanner.close();
    }
}
