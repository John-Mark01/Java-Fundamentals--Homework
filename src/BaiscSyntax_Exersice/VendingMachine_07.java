package BaiscSyntax_Exersice;

import java.util.Scanner;

public class VendingMachine_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double coinsSum = 0;

        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                coinsSum += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        while (!command.equals("End")) {

            switch (command) {
                case "Nuts":
                    if (coinsSum >= 2.0) {
                        System.out.println("Purchased Nuts");
                        coinsSum -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (coinsSum >= 0.7) {
                        System.out.println("Purchased Water");
                        coinsSum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (coinsSum >= 1.5) {
                        System.out.println("Purchased Crisps");
                        coinsSum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (coinsSum >= 0.8) {
                        System.out.println("Purchased Soda");
                        coinsSum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (coinsSum >= 1.0) {
                        System.out.println("Purchased Coke");
                        coinsSum -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinsSum);

    }
}
