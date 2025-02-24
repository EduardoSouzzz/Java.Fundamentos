import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana de 1 a 7: ");

        int DiaDaSemana = scanner.nextInt();

        switch (DiaDaSemana) {
            case 1:
                System.out.println("Hoje é Domingo!");
                break;

            case 2:
                System.out.println("Hoje é Segunda-Feira!");
                break;

            case 3:
                System.out.println("Hoje é Terça-Feira!");
                break;

            case 4:
                System.out.println("Hoje é Quarta-Feira!");
                break;

            case 5:
                System.out.println("Hoje é Quinta-Feira!");
                break;

            case 6:
                System.out.println("Hoje é Sexta-Feira!");
                break;

            case 7:
                System.out.println("Hoje é Sábado!");
                break;
            default:
                System.out.println("Número INVÁLIDO! Digite um número entre 1 e 7!");
        }

        scanner.close();
    }
}
