import java.util.ArrayList;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            numeros.add(num);
        }

        int soma = 0;
        for (Integer nn : numeros) {
            soma += nn;
        }
        System.out.println("Soma dos Números Digitados: " + soma);
        sc.close();
    }
}
