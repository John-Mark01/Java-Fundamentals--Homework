package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] wagonState = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int wagon = 0; wagon < wagonState.length; wagon++) {

            for (int seats = wagonState[wagon]; seats < 4; seats++) {
                if (peopleWaiting <= 0) {
                    System.out.println("The lift has empty spots!");
                    for (int i : wagonState) {
                        System.out.print(i + " ");
                    }
                    return;
                }
                wagonState[wagon] += 1;
                peopleWaiting -= 1;
            }
        }
        if (peopleWaiting > 0) {
            System.out.println("There isn't enough space! " + peopleWaiting + " people in a queue!");
            for (int i : wagonState) {
                System.out.print(i + " ");
            }
        } else {
            for (int i : wagonState) {
                System.out.print(i + " ");
            }
        }
    }
}
