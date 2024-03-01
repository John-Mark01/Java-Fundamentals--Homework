package Arrays_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= numbersArr.length -1 ; i++) {
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];
            } else {
                oddSum += numbersArr[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
