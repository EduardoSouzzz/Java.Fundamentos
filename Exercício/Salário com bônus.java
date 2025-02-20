import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Salário Com Bônus;

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double SalárioFixo = scanner.nextDouble();
        double TotalVendas = scanner.nextDouble();

        double Comissão = ( TotalVendas * 0.15 );
        double Total = ( SalárioFixo + Comissão );


        System.out.printf("TOTAL = R$ %.2f%n", Total );
        scanner.close();

    }
}
