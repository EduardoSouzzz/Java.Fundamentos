import java.util.ArrayList;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite as notas " + (i + 1) + ": ");
            double nt = sc.nextDouble();

            notas.add(nt);
        }
        System.out.println();

        double soma = 0.0;
        for (double n : notas) {
            soma += n;
        }
        System.out.println("Soma das notas: " + soma);
        double media = soma / notas.size();
        System.out.printf("Média das notas %.1f\n: ", media);

        sc.close();
    }
}
