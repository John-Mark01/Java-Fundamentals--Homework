package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {

                int givenFirstIndex = Integer.parseInt(command.split(" ")[1]);
                int givenSecondIndex = Integer.parseInt(command.split(" ")[2]);

                int arrayFirstIndex = numbers[givenFirstIndex];
                int arraySecondIndex = numbers[givenSecondIndex];

                numbers[givenFirstIndex] = arraySecondIndex;
                numbers[givenSecondIndex] = arrayFirstIndex;

            } else if (command.contains("multiply")) {

                int givenFirstIndex = Integer.parseInt(command.split(" ")[1]);
                int givenSecondIndex = Integer.parseInt(command.split(" ")[2]);

               numbers[givenFirstIndex] = numbers[givenFirstIndex] * numbers[givenSecondIndex];

            } else {
                for (int i = 0; i <= numbers.length -1; i++) {
                    int number = numbers[i] - 1;
                    numbers[i] = number;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length -1 ; i++) {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.print(numbers[numbers.length -1]);
    }
}
