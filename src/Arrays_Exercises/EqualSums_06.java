package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int position = 0; position <= numbers.length -1; position++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftSide = 0; leftSide < position ; leftSide++) {
                leftSum += numbers[leftSide];
            }

            for (int rightSide = position + 1; rightSide <= numbers.length -1; rightSide++) {
                rightSum += numbers[rightSide];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                return;
            }
        }
        System.out.println("no");
    }
}
