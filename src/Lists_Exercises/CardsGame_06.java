package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstHand.isEmpty() && !secondHand.isEmpty()) {

            int firstHandCard = firstHand.get(0);
            int secondHandCard = secondHand.get(0);

            firstHand.remove(0);
            secondHand.remove(0);

            if (firstHandCard > secondHandCard) {
                firstHand.add(firstHandCard);
                firstHand.add(secondHandCard);
            } else if (secondHandCard > firstHandCard){
               secondHand.add(secondHandCard);
               secondHand.add(firstHandCard);
            }
        }

        if (!firstHand.isEmpty()) {
           int sum = firstHand.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d\n", sum);
        } else {
            int sum = secondHand.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d\n", sum);
        }
    }
}
