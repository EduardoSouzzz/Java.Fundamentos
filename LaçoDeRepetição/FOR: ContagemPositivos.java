import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contadorPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double valor = scanner.nextDouble();
            if (valor > 0) {
                contadorPositivos++;
            }
        }

        System.out.println(contadorPositivos + " valores positivos");
        scanner.close();

    }
}
