import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // triangulo
        double TRIANGULO = ( A * C ) / 2;

        // circulo
        double pi = 3.14159;
        double raio_ao2 = ( C * C);
        double CIRCULO = ( raio_ao2 * pi);

        // trapézio
        double TRAPEZIO = (( A + B) * C) / 2;

        // quadrado
        double QUADRADO = (B * B);

        // retângulo
        double RETANGULO = ( A * B);

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        scanner.close();
    }
}
