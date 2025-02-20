import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;

        double MEDIA = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", MEDIA);
        scanner.close();


    }
}
