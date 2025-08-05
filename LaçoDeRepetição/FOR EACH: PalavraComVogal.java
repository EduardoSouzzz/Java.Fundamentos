import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] palavras = new String[6];

        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite uma palavra " + (i+1) + ": ");
            palavras[i] = sc.nextLine();

        }
        for (String p : palavras) {
            if (p.startsWith("a") || p.startsWith("e" ) || p.startsWith("i")
                    || p.startsWith("o") || p.startsWith("u")) {
                System.out.println(p);
            }
        }
        sc.close();
    }
}
