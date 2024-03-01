package BasicSyntax_Lecture;

import java.util.Scanner;

public class MultiplicationTable_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= 10; count++) {
            System.out.printf("%d X %d = %d\n", number, count, number * count);
        }
    }
}
