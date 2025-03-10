public class MinhaClass_3 {
    public static void main(String[] args) {

        double[] numeros = {10.5, 20.7, 15.3, 40.2, 8.9};
        double maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior elementos é: " + maior);

    }
}
