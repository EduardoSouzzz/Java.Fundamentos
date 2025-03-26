import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int peçaUm = sc.nextInt();
        int qntd1 = sc.nextInt();
        double valorDaPeça = sc.nextDouble();

        System.out.println();

        int peçaDois = sc.nextInt();
        int qntd2 = sc.nextInt();
        double valorDaPeça2 = sc.nextDouble();


        double pecas1 = ( qntd1 * valorDaPeça );
        double pecas2 = ( qntd2 * valorDaPeça2 );

        double calculo = ( pecas1 + pecas2 );
        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", calculo);


        sc.close();
    }
}
