import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os lados do triangulo X: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("Digite os lados do triangulo Y: ");
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();


        // area X;
        double pX =  ( a + b + c ) / 2;
        double areaDoTrianguloX = Math.sqrt(pX * (pX - a) * (pX - b) *
                (pX - c));
        System.out.printf("Área do triangulo X: %.4f%n", areaDoTrianguloX);

        // area Y;
        double pY = ( d + e + f) / 2;
        double areaDoTrianguloY = Math.sqrt(pY * ( pY - d ) * (pY - e) *
                (pY - f));
        System.out.printf("Área do triangulo Y: %.4f%n", areaDoTrianguloY);


        // qual o triangulo maior?;
        if (pX > pY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        scanner.close();
    }
}
