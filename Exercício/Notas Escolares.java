import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner LerNotas = new Scanner(System.in);

        System.out.println("Digite a sua nota do 1 Bimestre: ");
        float nota1Bimestre = LerNotas.nextFloat();

        System.out.println("Digite a sua nota do 2 Bimestre: ");
        float nota2Bimestre = LerNotas.nextFloat();

        System.out.println("Digite a sua nota do 3 Bimestre: ");
        float nota3Bimestre = LerNotas.nextFloat();

        double MEDIA = (nota1Bimestre + nota2Bimestre + nota3Bimestre) / 3;
        System.out.println("A Media de suas notas é: " + MEDIA);

        LerNotas.close();
    }
}
