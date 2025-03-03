import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número maior que 10: ");
        numero = scanner.nextInt();

        while (numero <= 10) {
            System.out.print("Tente novamente: ");
            numero = scanner.nextInt();
        }

        System.out.println("Número aceito!");

    }
}
