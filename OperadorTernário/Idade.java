import java.util.Scanner;

public class MinhaClass_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        String resultado = ( idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(resultado);

    }
}
