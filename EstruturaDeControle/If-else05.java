import java.util.Scanner;

public class MinhaClass_6 {
    public static void main(String[] args) {

        // Simulação de um Sistema De Autenticação;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de um usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("Digite a SENHA: ");
        String senha = scanner.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Autenticação bem-sucedida");
            
        } else {
            System.out.println("Usuário ou senha incorretos");
        }
        scanner.close();
    }
}
