import java.util.Scanner;

public class TD4EX5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
