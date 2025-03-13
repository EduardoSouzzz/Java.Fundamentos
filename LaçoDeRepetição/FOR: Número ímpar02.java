import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (X % 2 == 0) {
            X++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(X);
            X += 2;
        }
        scanner.close();
    }
}
