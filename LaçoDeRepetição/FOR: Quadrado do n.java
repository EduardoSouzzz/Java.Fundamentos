import java.util.Scanner;

public class MinhaClass_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            int pri = i;
            int seg = i * i;
            int ter = i * i * i;
            System.out.printf("%d %d %d%n", pri, seg, ter);
        }
        scanner.close();
    }
}
