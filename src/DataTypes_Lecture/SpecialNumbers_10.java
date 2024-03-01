package DataTypes_Lecture;

import java.util.Scanner;

public class SpecialNumbers_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 1; index <= number ; index++) {

            int sum = 0;
            int currentNum = index;

            while (currentNum != 0) {
                int lastDigit = currentNum % 10;
                sum += lastDigit;
                currentNum /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(index + " -> True");
            } else {
                System.out.println(index + " -> False");
            }
        }
    }
}
