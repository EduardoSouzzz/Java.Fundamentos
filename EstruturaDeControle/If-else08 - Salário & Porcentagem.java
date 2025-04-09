import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        
        if (salario >= 0 && salario <= 400.00) {
            double media = ( salario * 0.15);
            double novoSalario = (salario + media);

            System.out.printf("Novo salario: %.2f%n ", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", media);
            System.out.println("Em percentual: 15 % " );


        } else if (salario >= 400.01 && salario <= 800.00) {
            double media1 = ( salario * 0.12);
            double novoSalario1 = ( salario + media1 );

            System.out.printf("Novo salario: %.2f%n", novoSalario1);
            System.out.printf("Reajuste ganho: %.2f%n", media1);
            System.out.println("Em percentual: 12 % " );

        } else if (salario >= 800.01 && salario <= 1200.00 ) {
            double media2 = ( salario * 0.10);
            double novoSalario2 = ( salario + media2);

            System.out.printf("Novo salario: %.2f%n", novoSalario2);
            System.out.printf("Reajuste ganho: %.2f%n", media2);
            System.out.println("Em percentual: 10 % " );

        } else if (salario >= 1200.01 && salario <= 2000.00) {
            double media3 = ( salario * 0.07);
            double novoSalario3 = ( salario + media3);

            System.out.printf("Novo salario: %.2f%n", novoSalario3);
            System.out.printf("Reajuste ganho: %.2f%n", media3);
            System.out.println("Em percentual: 7 % " );

        } else {
            double media4 = ( salario * 0.04);
            double novoSalario4 = ( salario + media4);

            System.out.printf("Novo salario: %.2f%n", novoSalario4);
            System.out.printf("Reajuste ganho: %.2f%n", media4);
            System.out.println("Em percentual: 4 % " );

        }

        sc.close();
    }
}
