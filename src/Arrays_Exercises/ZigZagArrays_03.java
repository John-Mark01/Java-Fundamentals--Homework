package Arrays_Exercises;

import java.util.Scanner;

public class ZigZagArrays_03 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        int position = 0;

        for (int row = 1; row <= n; row++) {

            String[] input = scanner.nextLine().split(" ");

            String firstElement = input[0];
            String secondElement = input[1];

            if (row % 2 != 0) {
                firstArray[position] = firstElement;
                secondArray[position] = secondElement;
            } else {
                firstArray[position] = secondElement;
                secondArray[position] = firstElement;
            }
            position++;
        }

        for (String el1 : firstArray) {
            System.out.print(el1 + " ");
        }
        System.out.println();
        for (String el2 : secondArray) {
            System.out.print(el2 + " ");
        }
    }
}
