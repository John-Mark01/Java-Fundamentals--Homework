package Practice_For_FinalExam;

import java.util.Scanner;

public class loops_conditional_statements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalExpence = 0.0;

        for (int game = 1; game <= lostGames ; game++) {
           if (game % 2 == 0) {
               totalExpence += headsetPrice;
           }
           if (game % 3 == 0) {
               totalExpence += mousePrice;
           }
           if (game % 6 == 0) {
               totalExpence += keyboardPrice;
           }
           if (game % 12 == 0) {
               totalExpence += displayPrice;
           }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalExpence);
    }
}
