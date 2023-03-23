import java.util.Scanner;

public class TD4CE {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("-------- Menu ---------");
            System.out.println("1. Prime number");
            System.out.println("2. Lucky number");
            System.out.println("3. Reversing number");
            System.out.println("4. Money exchange");
            System.out.println("5. Max among 8 numbers");
            System.out.println("6. Shipping");
            System.out.println("7. Leap year");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            System.out.println("-----------------------");
            switch (option) {
                case 1:
                    TD4EX1.main(null);
                    break;
                case 2:
                    TD4EX2.main(null);
                    break;
                case 3:
                    TD4EX3.main(null);
                    break;
                case 4:
                    TD4EX4.main(null);
                    break;
                case 5:
                    TD4EX5.main(null);
                    break;
                case 6:
                    TD4EX6.main(null);
                    break;
                case 7:
                    TD4EX7.main(null);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } while (option != 0);
        scanner.close();
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}