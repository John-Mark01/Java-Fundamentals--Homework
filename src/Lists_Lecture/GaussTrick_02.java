package Lists_Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int numberToAdd = 0;
        int numberToSubtract = 0;

        while (!numbers.isEmpty()) {
            int sum = 0;
            int firstN = numbers.getFirst();
            int lastN = numbers.getLast();

            sum += (firstN + numberToAdd) + (lastN - numberToSubtract);
            System.out.print(sum + " ");

                numberToAdd++;
                numberToSubtract++;
                numbers.removeFirst();
                if (numbers.isEmpty()) {
                    break;
                } else {
                    numbers.removeLast();
                }
        }
    }
}
