import java.util.Scanner;

public class TD3EX3 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours: ");
        int startHours = sc.nextInt();
        System.out.print("Please input start minutes: ");
        int startMinutes = sc.nextInt();
        System.out.print("Please input start seconds: ");
        int startSeconds = sc.nextInt();
        System.out.print("Please input end hours: ");
        int endHours = sc.nextInt();
        System.out.print("Please input end minutes: ");
        int endMinutes = sc.nextInt();
        System.out.print("Please input end seconds: ");
        int endSeconds = sc.nextInt();

        int totalCallDuration = (endHours * 3600 + endMinutes * 60 + endSeconds)
                - (startHours * 3600 + startMinutes * 60 + startSeconds);
        int totalMinutes = totalCallDuration / 60;
        int totalHours = totalMinutes / 60;
        double callCost = totalMinutes * 0.05;

        System.out.println(
                "Total call duration: " + totalHours + "h " + (totalMinutes) + "mn " + (totalCallDuration % 60)
                        + "s");
        System.out.println("Total cost of this call: " + callCost + "$");

        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
