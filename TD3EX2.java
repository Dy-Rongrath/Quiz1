import java.util.Scanner;

public class TD3EX2 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input hours: ");
        int hours = sc.nextInt();
        System.out.print("Please input minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Please input seconds: ");
        int seconds = sc.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println("Number of seconds = " + hours + "x3600" + " + " + minutes + "x60" + " + " + seconds + " = "
                + totalSeconds);

        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
