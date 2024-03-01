package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = sum(number1, number2);
        subtract(sum, number3);
    }

    public static int sum(int first, int second) {
        return first + second;
    }
    public static void subtract(int sum, int number) {
        System.out.println(sum - number);
    }
}
