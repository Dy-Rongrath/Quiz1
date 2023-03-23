import java.util.Scanner;

public class TD3EX1 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        String time = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        System.out.println("Time corresponding to " + seconds + " seconds is " + time);

        System.out.println("\n\n\n\n\n\n\n\n");
    }

}
