package Arrays_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int sum = 0;
        boolean identical = false;
        int difference = 0;


        for (int position = 0; position <= firstArray.length -1 ; position++) {

            int firstNumber = firstArray[position];
            int secondNumber = secondArray[position];

            if (firstNumber == secondNumber) {
                identical = true;
                sum += firstNumber;
            } else {
                identical = false;
                difference = position;
                break;
            }
        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d\n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.\n", difference);
        }
        
    }
}
