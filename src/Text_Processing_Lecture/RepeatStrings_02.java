package Text_Processing_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatStrings_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        StringBuilder concatenatedArray = new StringBuilder();

        for (String word : array) {

            for (int times = 1; times <= word.length() ; times++) {
                concatenatedArray.append(word);
            }
        }
        System.out.println(concatenatedArray);
    }
}
