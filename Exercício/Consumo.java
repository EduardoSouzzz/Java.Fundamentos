import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();

        double calculo = ( distancia / combustivelGasto );
        System.out.printf("%.3f km/l%n", calculo);

        scanner.close();
    }
}
