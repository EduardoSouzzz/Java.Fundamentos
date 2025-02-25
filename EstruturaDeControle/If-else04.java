import java.util.Scanner;

public class MinhaClass_6 {
    public static void main(String[] args) {

        // Imposto
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário BRUTO: ");
        double salarioBruto = scanner.nextDouble();

        if (salarioBruto >= 2000) {
            double imposto = (salarioBruto - 2000.00) * 0.15;
            System.out.println("Imposto a ser pago: R$" + imposto);
        } else {
            System.out.println("O seu salário não está sujeito a impostos!");
        }
        
        scanner.close();
    }
}
