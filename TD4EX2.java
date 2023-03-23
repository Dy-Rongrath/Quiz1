import java.util.Scanner;

public class TD4EX2 {
    private int number;

    public TD4EX2(int number) {
        this.number = number;
    }

    public boolean isLucky() {
        int sumFirst3Digits = getDigitSum(number / 1000);
        int sumLast3Digits = getDigitSum(number % 1000);
        return sumFirst3Digits == sumLast3Digits;
    }

    public boolean isValid() {
        return number >= 100000 && number <= 999999;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Program for testing for lucky number.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input 6-digit number: ");
        int number = scanner.nextInt();

        TD4EX2 luckyNumber = new TD4EX2(number);
        if (!luckyNumber.isValid()) {
            System.out.println("Invalid input number, please input only 6-digit number.");
        } else if (luckyNumber.isLucky()) {
            System.out.println(number + " is a lucky number.");
        } else {
            System.out.println(number + " is not a lucky number.");
        }
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
