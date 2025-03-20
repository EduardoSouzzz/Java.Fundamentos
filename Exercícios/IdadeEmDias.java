import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idadeEmDias = scanner.nextInt();

        int ano = idadeEmDias / 365;
        int mes =  ( idadeEmDias % 365) / 30;
        int dias = ( idadeEmDias % 365) % 30;

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dias + " dia (s)");


    }
}
