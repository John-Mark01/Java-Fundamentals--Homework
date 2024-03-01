package Methods_Lecture;

import java.util.Scanner;

public class MathPower_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        double result = raiseToPower(number, power);
        System.out.printf("%.0f", result);
    }

    public static double raiseToPower(double number, double power) {

        return Math.pow(number, power);
    }
}
