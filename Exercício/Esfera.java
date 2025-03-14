import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double calculo = 4.0/3;

        double raioo = ( raio * raio * raio);
        double calcular = (calculo * pi);
        double volume = (calcular * raioo);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }
}
