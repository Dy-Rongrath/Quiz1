import java.util.Scanner;

public class TD3CE1 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("-------- Menu ---------");
            System.out.println("1. Seconds to Time");
            System.out.println("2. Time to Seconds");
            System.out.println("3. Calling Cost");
            System.out.println("4. Riels to Dollar");
            System.out.println("5. Traveling Duration");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            System.out.println("-----------------------");
            switch (option) {
                case 1:
                    TD3EX1.main(null);
                    break;
                case 2:
                    TD3EX2.main(null);
                    break;
                case 3:
                    TD3EX3.main(null);
                    break;
                case 4:
                    TD3EX4.main(null);
                    break;
                case 5:
                    TD3EX5.main(null);
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
