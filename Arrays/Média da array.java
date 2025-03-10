import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        // Escreva um programa Java que solicite ao usuário que insira 5 números inteiros e
        // armazene-os em um array. Em seguida, calcule e imprima a média dos números.
      
        // Media da array
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números: ");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        
        double media = (double) soma / numeros.length;
        System.out.println("A média é: " + media);
        
        scanner.close();
    }
}
