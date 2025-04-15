import java.util.Scanner;

public class MinhaClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();
        System.out.println(email);

        System.out.println();

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();


        while (senha != 8098) {
            System.out.println("Senha INVALIDA, tente novamente!");
            senha = sc.nextInt();
        }
        System.out.println("Senha CORRETA, Acesso Liberado!");
    }
}
