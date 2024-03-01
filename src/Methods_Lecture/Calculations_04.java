package Methods_Lecture;

import java.util.Scanner;

public class Calculations_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                addNumbers(num1, num2);
                break;
            case "subtract":
                subtractNumbers(num1, num2);
                break;
            case "multiply":
                multiplyNumbers(num1, num2);
                break;
            case "divide":
                divideNumbers(num1, num2);
                break;
        }
    }
    public static void addNumbers(int a, int b) {
        System.out.println(a + b);
    }
    public static void subtractNumbers(int a, int b) {
        System.out.println(a - b);
    }
    public static void multiplyNumbers(int a, int b) {
        System.out.println(a * b);
    }
    public static void divideNumbers(int a, int b) {
        System.out.println(a / b);
    }
}


