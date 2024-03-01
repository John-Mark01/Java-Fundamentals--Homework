package DataTypes_Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int sumOfSpiceExtracted = 0;
        int day = 0;
        while (yield >= 100) {

            sumOfSpiceExtracted += yield;
            yield -= 10;
            sumOfSpiceExtracted -= 26;

            day++;

            if (yield < 100) {
                sumOfSpiceExtracted -= 26;
            }
        }

        System.out.println(day);
        System.out.println(sumOfSpiceExtracted);
    }
}
