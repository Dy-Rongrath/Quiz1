import java.util.Scanner;

public class TD4EX3 {
    private int number;

    public TD4EX3(int number) {
        this.number = number;
    }

    public int reverse() {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public boolean isValid() {
        return number >= 1000 && number <= 9999;
    }

    public static void main(String[] args) {

        System.out.println("Program for reversing a 4 digit number.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input 4 digits number: ");
        int number = scanner.nextInt();

        TD4EX3 reverseNumber = new TD4EX3(number);

        if (reverseNumber.isValid()) {
            int reversedNumber = reverseNumber.reverse();
            System.out.println("After reverse: " + reversedNumber);
        } else {
            System.out.println("Error: invalid number, please input only 4 digits number.");
        }
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
