import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 100: ");
        int numero = sc.nextInt();

        // Verifica se o n digitado é entre 1 e 100;
        if (numero < 1 || numero > 100) {
            System.out.println("Número NÃO aceito!, Tente novamente!");
            numero = sc.nextInt();

        } else {
            System.out.println("Agora que você digitou o número entre" +
                    " 1 e 100, vamos começar a ADIVINHA!");
            System.out.println();
        }

        // Verifica se o número digitado passou perto;
        if (numero < 30) {
            System.out.println("Número muito baixo");

        } else {
            System.out.println("Número muito alto");
        }

        // se o número for diferente de 30, o número digitado é incorreto;
        while (numero != 30) {
            System.out.println("Número NÃO acertado, tente novamente!");
            numero = sc.nextInt();
        }
        System.out.println("Parábens, você ACERTOU o número!, e venceu o JOGO!");
        sc.close();
    }
}
