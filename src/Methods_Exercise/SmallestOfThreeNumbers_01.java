package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int thirdN = Integer.parseInt(scanner.nextLine());
        int smallestNumber = getSmallNumber(firstN, secondN, thirdN);
        System.out.println(smallestNumber);
    }

    public static int getSmallNumber(int a, int b, int c) {
        int smallest = 0;
        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }
        return smallest;
    }
}
