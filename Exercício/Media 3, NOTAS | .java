import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Media 3;

        Scanner scanner = new Scanner(System.in);

        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();

        int pesoN1 = 2;
        int pesoN2 = 3;
        int pesoN3 = 4;
        int pesoN4 = 1;

        double Media = ((N1 * pesoN1) + (N2 * pesoN2) + (N3 * pesoN3) + (N4 * pesoN4)) /
                ( pesoN1 + pesoN2 + pesoN3 + pesoN4);

        System.out.printf("Media: %.1f%n", Media  );

        if ( Media >= 7.0) {
            System.out.println("Aluno aprovado.");

        } else if ( Media < 5.0) {
            System.out.println("Aluno reprovado.");

        } else {
            System.out.println("Aluno em exame.");


            // Nota do aluno no exame;

            double NotaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", NotaExame);

            double Media2 = Math.floor((NotaExame + Media) / 2 * 10) / 10;

            if (Media2 >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", Media2);
        }

        scanner.close();

    }
}
