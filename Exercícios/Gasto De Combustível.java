import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        double calculo = ( tempo * velocidade );
        double quantidadePrecisa = ( calculo / 12 );
        System.out.printf("%.3f%n", quantidadePrecisa);

        scanner.close();
    }
}
