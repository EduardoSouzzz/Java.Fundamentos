import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 1) {
            System.out.println("IDADE INVALIDA");
          
        } else if (idade < 18) {
            System.out.println("Você tem " + idade + " Anos de idade, É menor de idade.");
          
        } else if (idade <= 60) {
            System.out.println("Você tem " + idade + " Anos de idade, já é um Adulto");
          
        } else {
            System.out.println("Vocé ja é considerado um Idoso");
        }
        scanner.close();

    }
}
