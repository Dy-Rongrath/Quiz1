import java.util.Scanner;

public class TD3EX4 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        final double CONVERSION_RATE = 4000.0 / 1.0; // 1 USD = 4000 RIELS
        Scanner input = new Scanner(System.in);

        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input money in Riels: ");
        int riels = input.nextInt();

        double dollars = riels / CONVERSION_RATE;
        System.out.printf("%d RIELS = %.2f USD", riels, dollars);

        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
