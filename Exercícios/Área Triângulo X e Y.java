import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os lados do triangulo X: ");
        double Xa = scanner.nextDouble();
        double Xb = scanner.nextDouble();
        double Xc = scanner.nextDouble();

        System.out.println("Digite os lados do triangulo Y: ");
        double Ya = scanner.nextDouble();
        double Yb = scanner.nextDouble();
        double Yc = scanner.nextDouble();


        // area X;
        double pX =  ( Xa + Xb + Xc ) / 2;
        double areaDoTrianguloX = Math.sqrt(pX * (pX - Xa) * (pX - Xb) *
                (pX - Xc));
        System.out.printf("Área do triangulo X: %.4f%n", areaDoTrianguloX);

        // area Y;
        double pY = ( Ya + Yb + Yc) / 2;
        double areaDoTrianguloY = Math.sqrt(pY * ( pY - Ya ) * (pY - Yb) *
                (pY - Yc));
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
