import java.util.Scanner;

public class TD4EX1 {
    private int number;

    public TD4EX1(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number to check whether it is prime number: ");
        int number = scanner.nextInt();

        TD4EX1 primeNumber = new TD4EX1(number);
        if (primeNumber.isPrime()) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out
                    .println(number + " is not a prime number, because it is divisible to " + getDivisors(primeNumber));
        }
        System.out.println("\n\n\n\n\n\n\n\n");
    }

    private static String getDivisors(TD4EX1 primeNumber) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < primeNumber.number; i++) {
            if (primeNumber.number % i == 0) {
                sb.append(i).append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();

    }
}
