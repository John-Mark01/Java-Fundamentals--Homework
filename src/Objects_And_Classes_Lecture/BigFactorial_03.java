package Objects_And_Classes_Lecture;

import java.util.Scanner;

public class BigFactorial_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        for (int number = 2; number <= n; number++) {
            int newNumber = number * number;
            sum += newNumber;
        }

        System.out.println(sum);
    }
}
