import java.util.ArrayList;
import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite os nomes: ");
            String nm = sc.nextLine();

            nomes.add(nm);
        }

        int cont = 0;
        for (String n : nomes) {
            if (n.length() > 5) {
                cont++;
            }
        }
        System.out.println("Nomes maiores que 5 letras: " + cont);
        sc.close();
    }
}
