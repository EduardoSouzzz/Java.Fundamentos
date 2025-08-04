import java.util.ArrayList;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número " + (i+1) + ": ");
            int n = sc.nextInt();

            num.add(n);
        }
        System.out.println();
        System.out.print("Digite outro número: ");
        int gg = sc.nextInt();

        boolean encontrado = false;

        for (Integer nn : num) {
            if (nn == gg) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado.");
        }
        sc.close();
    }
}
