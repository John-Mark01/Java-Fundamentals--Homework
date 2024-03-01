package BaiscSyntax_Exersice;

import java.util.Scanner;

public class TriangleOfNumbers_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= number ; row++) {
            for (int num = 1; num <= row ; num++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
