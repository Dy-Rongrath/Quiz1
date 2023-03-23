import java.util.Scanner;

public class TP2EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n");

        // Prompt the user for a positive number
        System.out.print("Please input a positive number: ");
        int number = input.nextInt();

        // Calculate the number of hundreds in the given number
        int numHundreds = number / 100;

        // Display the result to the user
        System.out.println("There are " + numHundreds + " hundred in number " + number + ".");

        System.out.println("\n\n\n\n\n\n\n\n");
        input.close();
    }
}
