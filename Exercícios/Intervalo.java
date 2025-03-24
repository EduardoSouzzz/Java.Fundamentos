import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();

        if (valor >= 0 && valor <= 25.00) {
            System.out.println("Intervalo [0,25]");

        } else if (valor >= 25.01 && valor <= 50.00) {
            System.out.println("Intervalo (25,50]");

        } else if (valor >= 50.01 && valor <= 75.00) {
            System.out.println("Intervalo (50,75]");

        } else if (valor >= 75.01 && valor <= 100.00) {
            System.out.println("Intervalo (75,100]");

        } else {
            System.out.println("Fora de intervalo");
        }
        scanner.close();
    }
}
