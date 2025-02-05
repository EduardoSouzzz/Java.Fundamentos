import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");

        String frase = scanner.nextLine();
        int quantidadeDeLetras = 0;

        for ( int indice = 0; indice < frase.length() ; indice++ ){ // frase.length() = Diz quantas caractere a string tem
            char letra = frase.charAt(indice); // chat.At = saber o indice da frase
            boolean isLetra = Character.isLetter(letra); // Character.isLetter = Verifica se é LETRA

            if (isLetra){
                quantidadeDeLetras++;
            }
        }
        System.out.println("A quantidade de letras dessa frase é: " + quantidadeDeLetras);
        scanner.close();
    } 
}
