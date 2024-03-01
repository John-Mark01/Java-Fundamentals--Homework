package Arrays_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int position = input.length -1; position >= 0 ; position--) {
            System.out.print(input[position] + " ");
        }
    }
}
