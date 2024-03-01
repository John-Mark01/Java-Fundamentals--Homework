package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int times = 1; times <= rotations ; times++) {

            int firstPosition = array[0];

            for (int position = 0; position < array.length -1 ; position++) {
                array[position] = array[position + 1];
            }

            array[array.length -1] = firstPosition;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
