package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int uniqueNum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbers.length -1; index++) {
            int currentNumber = numbers[index];

            for (int nextIndex = index + 1; nextIndex <= numbers.length -1; nextIndex++) {

                int nextNumber = numbers[nextIndex];

                if (currentNumber + nextNumber == uniqueNum) {
                    System.out.printf("%d %d\n", currentNumber, nextNumber);
                }
            }
        }
    }
}
