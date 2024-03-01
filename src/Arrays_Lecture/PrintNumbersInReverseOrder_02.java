package Arrays_Lecture;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] array = new int[n];

        for (int number = 0 ; number < n ; number++) {
            int input = Integer.parseInt(scanner.nextLine());
            array[number] = input;
        }

        for (int position = array.length -1; position >= 0; position--) {
            System.out.print(array[position] + " ");
        }
    }
}
