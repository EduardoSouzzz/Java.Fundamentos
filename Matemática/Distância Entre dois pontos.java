import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        // Math.sqrt(x) → RAIZ QUADRADA;
        // Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Math.pow(base, expoente) → POTENCIAÇÃO;
        // Math.pow(x2 - x1, 2)
      
      
        // Lendo os valores de entrada
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculando a distância euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Exibindo a saída formatada com 4 casas decimais
        System.out.printf("%.4f%n", distancia);

        sc.close();
    }
}
