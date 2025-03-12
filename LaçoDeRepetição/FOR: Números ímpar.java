import java.util.Scanner;

public class MinhaClass_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int X = scanner.nextInt();

        for (int i = 1; i <= X; i+=1) {
            if (i % 2 != 0 ) {
                System.out.println(i);
            }
        }

    }
}

