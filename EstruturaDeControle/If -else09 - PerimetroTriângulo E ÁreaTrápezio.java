import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double somaPerimetro = (a + b + c);
            System.out.printf("Perimetro = %.1f%n", somaPerimetro);
        } else {
            double AreaT1 = ( a + b );
            double AreaT2 = ( AreaT1 * c);
            double AreaT3 = ( AreaT2 / 2);
            System.out.printf("Area = %.1f%n", AreaT3);
        }
        sc.close();
    }
}
