package BasicSyntax_Lecture;

import java.util.Scanner;

public class SumOfOddNumbers_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 1;

        for (int count = 0; count < n ; count++) {
                System.out.println(number);
                sum += number;
                number += 2;
        }
        System.out.println("Sum: " + sum);
    }
}
