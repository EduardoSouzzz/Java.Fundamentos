import java.util.Scanner;

public class MinhaClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um operador ( +, -, *, / ): ");
        String operador = sc.nextLine();

        while (!operador.equals("+") && !operador.equals("-") &&
                !operador.equals("*") && !operador.equals("/")) {

            System.out.println("ERRO, Digite um operador ( +, -, *, / ): ");
            operador = sc.nextLine();
        }

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        switch (operador) {
            case "+" :
                int adicao = ( num1 + num2 );
                System.out.println("A sua conta de adição é: " + adicao);
                break;


            case "-" :
                int subtracao = ( num1 - num2 );
                System.out.println("A sua conta de subtração é: " + subtracao);
                break;


            case "*" :
                int multiplicacao = ( num1 * num2 );
                System.out.println("A sua conta de multiplicação é: " + multiplicacao);
                break;

            case "/" :
                int divisao = ( num1 / num2 );
                System.out.println("A sua conta de divisão é: " + divisao);
                break;
        }


        sc.close();
    }
}
