import java.util.Scanner;

public class MinhaClass {
    public static void main(String[] args) {

        // Conta de empresas de logistica para saberem o SEU ESTOQUE!
        
        // Estoque Máximo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Consumo Médio Diário da Empresa: ");
        int Consumo_Diario_Maximo = scanner.nextInt();

        System.out.println("Agora, Digite o tempo de reposição: ");
        int tempo_do_maximo = scanner.nextInt();

        System.out.println("Agora, Digite as unidades no Estoque de Segurança: ");
        int estoque = scanner.nextInt();


        // Cálculo do Estoque Máximo;
        int Estoque_Maximo = ( Consumo_Diario_Maximo * tempo_do_maximo ) + estoque;
        System.out.println("O Estoque Máximo será de: " + Estoque_Maximo + " unidades.");

        
        System.out.println();


        // Estoque Mínimo;
        System.out.println("Agora, Será a conta do ESTOQUE MÍNIMO!");

        System.out.println("Digite O CONSUMO DIÁRIO da Empresa: ");
        int Consumo_Diario_Minimo = scanner.nextInt();

        System.out.println("Agora, Digite o TEMPO de reposição: ");
        int tempo_do_minimo = scanner.nextInt();


        // Cálculo do Estoque Mínimo;
        int Estoque_Minimo = ( Consumo_Diario_Minimo * tempo_do_minimo );
        System.out.println("O Estoque Mínimo será de: " + Estoque_Minimo + " unidades.");

        scanner.close();
    }
}
