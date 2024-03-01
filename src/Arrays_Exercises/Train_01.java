package Arrays_Exercises;

import java.util.Scanner;

public class Train_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());
        int[] peopleArray = new int[wagonCount];
        int sum = 0;

        for (int i = 0; i < wagonCount ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            peopleArray[i] = people;
        }

        for (int i = 0; i <= peopleArray.length -1 ; i++) {
            System.out.print(peopleArray[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
