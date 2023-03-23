import java.util.Scanner;

public class TP2EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n");

        // Prompt the user for a positive number
        System.out.print("Please input a positive number: ");
        int number = input.nextInt();

        // Add 1 to the inputted number
        int result = number + 1;

        // Display the result to the user
        System.out.println("I got " + result + ". I am luckier.");

        System.out.println("\n\n\n\n\n\n\n\n");
        input.close();
    }
}
