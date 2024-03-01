package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(first, second);
        System.out.printf("%.2f",result);

    }

    public static double calculateFactorial(int first, int second) {

        double sum = 0;
        double fistNumberFactorial = 1;
        double secondNumberFactorial = 1;

        for (int i = 1; i <= first ; i++) {
            fistNumberFactorial *= i;
        }
        for (int i = 1; i <= second ; i++) {
            secondNumberFactorial *= i;
        }

        sum = fistNumberFactorial / secondNumberFactorial;

        return sum;
    }
}
