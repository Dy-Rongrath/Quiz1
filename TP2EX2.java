import java.util.Scanner;

public class TP2EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n\n\n\n\n\n\n");
        // Prompt the user for the width and height of the rectangle
        System.out.print("Please input width (in meter): ");
        double width = input.nextDouble();

        System.out.print("Please input height (in meter): ");
        double height = input.nextDouble();

        // Calculate the perimeter and surface area of the rectangle
        double perimeter = 2 * (width + height);
        double surfaceArea = width * height;

        // Display the results to the user
        System.out.println("Perimeter = (" + width + " + " + height + ") x 2 = " + perimeter + " m");
        System.out.println("Surface = " + width + " x " + height + " = " + surfaceArea + " m^2");
        System.out.println("\n\n\n\n\n\n\n\n");

        input.close();
    }
}
