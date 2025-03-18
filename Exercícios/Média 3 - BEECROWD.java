import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        // pesos;
        int pesoN1 = 2;
        int pesoN2 = 3;
        int pesoN3 = 4;
        int pesoN4 = 1;

        // media
        double media = ( (n1 * pesoN1) + ( n2 * pesoN2 ) + ( n3 * pesoN3 ) +
                (n4 * pesoN4)) / ( pesoN1 + pesoN2 + pesoN3 + pesoN4);

        System.out.println("Media: " + media);

        if (media <= 5.0) {
            System.out.println("Aluno reprovado.");

        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");

            // nota do exame;
            System.out.println("Digite a nota do exame: ");
            double notaExame = sc.nextDouble();

            System.out.println("Nota do exame: " + notaExame);

            double media2 = Math.floor((notaExame + media) / 2 * 10) / 10;

            if (notaExame >= 5.0) {
                System.out.println("Aluno aprovado.");

            } else {
                System.out.println("Aluno reprovado.");
            }

            // media final;
            System.out.println("Media final: " + media2);


        } else {
            System.out.println("Aluno aprovado.");
        }


        sc.close();
    }
}
