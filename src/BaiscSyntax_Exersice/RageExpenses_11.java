package BaiscSyntax_Exersice;

import java.util.Scanner;

public class RageExpenses_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int lostCounter = 0;
        double expenses = 0;

        for (int games = 1; games <= lostGames ; games++) {
           if (games % 2 == 0) {
               expenses += headSetPrice;
           } else if (games % 3 == 0) {
               expenses += mousePrice;
           }
        }
    }
}
