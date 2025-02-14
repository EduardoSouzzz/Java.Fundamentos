import java.util.Scanner;

public class MinhaClass_7 {
    public static void main(String[] args) {

        // Saber qual dia é hoje!
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia do mês de fevereiro de 2025 (entre 1 e 29): ");
        int dia = scanner.nextInt();

        // Validação de entrada
        if (dia < 1 || dia > 29) {
            System.out.println("Dia inválido! Insira um número entre 1 e 29.");
        } else {

            // Array com os dias da semana começando de Segunda-feira (dia 3 de fevereiro de 2025)
            String[] diasSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};

            // Calcular o dia da semana com base no primeiro dia do mês
            int indice = (dia - 3) % 7;
            if (indice < 0) {
                indice += 7; // Corrige para índices negativos
            }

            System.out.println("Hoje é " + diasSemana[indice] + "! " + dia + "/02/25");
        }

        scanner.close();
    }
}
