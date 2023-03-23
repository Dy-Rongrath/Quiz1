import java.util.Scanner;

public class TP2EX1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.print("Input your name: ");
        x = sc.nextLine();
        System.out.print("Welcome " + x);
        sc.close();
    }
}
