import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Chama a função que verifica se o número é perfeito
        if (ehNumeroPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }

    // Função para verificar se o número é perfeito
    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        // Calcula a soma dos divisores próprios
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        // Verifica se a soma dos divisores é igual ao número
        return somaDivisores == numero;
    }
}
