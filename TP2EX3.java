import java.util.Scanner;

public class TP2EX3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n");
        float x, y, z;
        System.out.print("Input y z: ");
        y = sc.nextFloat();
        z = sc.nextFloat();
        x = 1 / (1 / y + 1 / z);
        System.out.println("X = " + x);
        sc.close();
        System.out.println("\n\n\n\n\n\n\n\n");

    }
}
