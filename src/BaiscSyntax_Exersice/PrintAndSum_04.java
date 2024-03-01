package BaiscSyntax_Exersice;

import java.util.Scanner;

public class PrintAndSum_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = start;

        while (count <= end) {
            System.out.printf(count + " ");

            sum += count;
            count++;
        }
        System.out.printf("\n");
        System.out.println("Sum: " + sum);

    }
}
