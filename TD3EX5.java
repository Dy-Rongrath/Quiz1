import java.util.Scanner;

public class TD3EX5 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        final int DISTANCE = 7; // km
        final int SPEED = 30; // km/h
        Scanner input = new Scanner(System.in);

        System.out.print("Please input traffic jam factor (in percentage [0-100]): ");
        int jamFactor = input.nextInt();
        double adjustedSpeed = SPEED * (100.0 - jamFactor) / 100.0; // km/h
        int durationInSeconds = (int) (DISTANCE / adjustedSpeed * 3600); // seconds
        int hours = durationInSeconds / 3600;
        int minutes = (durationInSeconds % 3600) / 60;
        int seconds = durationInSeconds % 60;
        System.out.printf("Travelling Duration = %02d:%02d:%02d", hours, minutes, seconds);

        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
