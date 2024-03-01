package Methods_Lecture;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        System.out.println(evenSum * oddSum);
    }

    public static int getEvenSum(int n) {
        int evenSum = 0;
        String numberString = String.valueOf(n);
        for (int i = 0; i < numberString.length(); i++) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            n /= 10;
        }
        return evenSum;
    }
    public static int getOddSum(int n) {
        int oddSum = 0;
        String numberString = String.valueOf(n);
        for (int i = 0; i < numberString.length(); i++) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            n/=10;
        }
        return oddSum;
    }
}
