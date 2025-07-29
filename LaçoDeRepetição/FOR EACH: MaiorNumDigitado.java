import java.util.ArrayList;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> numero = new ArrayList<>();

        for (double i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();

            numero.add(num);
        }

        double maior = numero.get(0);

        for (Double n : numero) {
           if (n > maior) {
               maior = n;
           }
        }
        System.out.println();
        System.out.println("Maior n digitado: " + maior);

        sc.close();
    }
}
