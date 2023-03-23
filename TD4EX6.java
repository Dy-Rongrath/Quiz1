import java.util.Scanner;

public class TD4EX6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the distance from point A to point B (in km): ");
        double distanceAB = scanner.nextDouble();
        System.out.print("Enter the weight of goods (in kg): ");
        int weight = scanner.nextInt();
        System.out.print("Enter the distance from point B to point C (in km): ");
        double distanceBC = scanner.nextDouble();

        // Calculate the required petrol
        double petrol = 0;
        if (weight <= 5000) {
            petrol = distanceAB * 10 + distanceBC * 10;
        } else if (weight <= 10000) {
            petrol = distanceAB * 20 + distanceBC * 20;
        } else if (weight <= 20000) {
            petrol = distanceAB * 25 + distanceBC * 25;
        } else if (weight <= 30000) {
            petrol = distanceAB * 35 + distanceBC * 35;
        } else {
            System.out.println("Cannot be loaded: Weight exceeds 30000kg");
            return;
        }

        // Check if a refill is needed at point B
        if (petrol > 5000) {
            double petrolNeeded = petrol - 5000;
            System.out.println("The ship needs to refill " + petrolNeeded + " liters of petrol at point B");
        } else {
            System.out.println("The ship does not need to refill at point B");
        }
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
