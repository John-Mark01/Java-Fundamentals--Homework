package Methods_Lecture;

import java.util.Scanner;

public class MathOperations_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int value2 = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case "*":
                System.out.println(multiply(value1, value2));
                break;
            case "/":
                System.out.println(divide(value1, value2));
                break;
            case "+":
                System.out.println(add(value1, value2));
                break;
            case "-":
                System.out.println(subtract(value1, value2));
                break;
        }
    }

    private static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    private static int add(int value1, int value2) {
        return value1 + value2;
    }

    private static int divide(int value1, int value2) {
        return value1 / value2;
    }

    private static int multiply(int value1, int value2) {
        return value1 * value2;
    }
}
