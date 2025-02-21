import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner LerAlturaAndPeso = new Scanner(System.in); // System.in == Entrada Padrão (Teclado)

        System.out.println("Digite seu Peso (EM KG): ");
        float peso = LerAlturaAndPeso.nextFloat(); // Ler o numero flutuante q o usuario digitou

        System.out.println("Agora, Digite sua altura (EM METROS): ");
        float altura = LerAlturaAndPeso.nextFloat();

        float resultado = peso / (altura * altura);
        System.out.println("O seu IMC é: " + resultado);

        LerAlturaAndPeso.close(); // .close() serve para fechar a class Scanner.

    }
}
