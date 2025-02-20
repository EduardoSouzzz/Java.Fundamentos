public class Main {
    public static void main(String[] args) {

        // Escreva um programa Java que imprima os números
        // primos entre 1 e 50 usando um loop for.

        for ( int numero = 2; numero <= 50; numero++){
            boolean ehPrimo = true; // confirma se é primo.

            for ( int j = 2; j < numero; j++){
                if ( numero % j == 0){
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo){
                System.out.println(numero + " é primo");
            }
        }

    }
}
