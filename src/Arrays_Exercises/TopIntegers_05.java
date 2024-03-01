package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int positon = 0; positon < array.length -1 ; positon++) {

            int number = array[positon];
            boolean isBigger = true;

             for (int nextNum = positon + 1; nextNum < array.length; nextNum++) {

                 int nextNumber = array[nextNum];

                 if (nextNumber >= number) {
                     isBigger = false;
                     break;
                 }
            }
             if (isBigger) {
                 System.out.print(number + " ");
             }
        }
        System.out.println(array[array.length - 1]);
    }
}
