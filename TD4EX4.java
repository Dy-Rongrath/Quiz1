import java.util.Scanner;

public class TD4EX4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // create currency objects
        Riels riels = new Riels();
        Dollar dollar = new Dollar();
        ThaiBaht thaiBaht = new ThaiBaht();

        // display welcome message and menu
        System.out.println("Welcome to program Money Exchanges!");
        System.out.println("1. Riels to Dollar");
        System.out.println("2. Riels to Thai Baht");
        System.out.println("3. Dollar to Riels");
        System.out.println("4. Dollar to Thai Baht");
        System.out.println("5. Thai Baht to Riels");
        System.out.println("6. Exit");

        // loop for user input and processing
        while (true) {
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            if (option == 6) {
                break;
            }

            Currency fromCurrency, toCurrency;
            double amount;
            switch (option) {
                case 1:
                    fromCurrency = riels;
                    toCurrency = dollar;
                    System.out.print("Input money in RIELS: ");
                    amount = scanner.nextDouble();
                    break;
                case 2:
                    fromCurrency = riels;
                    toCurrency = thaiBaht;
                    System.out.print("Input money in RIELS: ");
                    amount = scanner.nextDouble();
                    break;
                case 3:
                    fromCurrency = dollar;
                    toCurrency = riels;
                    System.out.print("Input money in USD: ");
                    amount = scanner.nextDouble();
                    break;
                case 4:
                    fromCurrency = dollar;
                    toCurrency = thaiBaht;
                    System.out.print("Input money in USD: ");
                    amount = scanner.nextDouble();
                    break;
                case 5:
                    fromCurrency = thaiBaht;
                    toCurrency = riels;
                    System.out.print("Input money in THAI BAHT: ");
                    amount = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Invalid option");
                    continue;
            }

            double exchangedAmount = fromCurrency.exchangeTo(toCurrency, amount);
            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency.getName(),
                    exchangedAmount, toCurrency.getName());
        }

        System.out.println("Goodbye");
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
