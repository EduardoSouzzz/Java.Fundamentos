import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opção = 0;

        do {
            System.out.println();
            System.out.println("Digite um alimento para comprar:");
            System.out.println("1. Sanduiche");
            System.out.println("2. Pizza");
            System.out.println("3. Sorvete");
            System.out.println("0. Sair");

            opção = scanner.nextInt();

            if ( opção == 0){
                System.out.println("Saindo do sistema");
            } else if ( opção == 1) {
                System.out.println("Você comprou um sanduiche");
            } else if ( opção == 2) {
                System.out.println("Você comprou uma pizza");
            }else {
                System.out.println("Você comprou um sorvete");
            }

        } while ( opção != 0);
        System.out.println("opção: " + opção);
        scanner.close();
    }
}
