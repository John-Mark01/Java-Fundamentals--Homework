package BaiscSyntax_Exersice;

import java.util.Scanner;

public class Orders_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double total = 0.0;


        for (int order = 1; order <= orders ; order++) {
            double capsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double totalPrice = (capsuleCount * capsule) * days;
            total += totalPrice;
            System.out.printf("The price for the coffee is: $%.2f\n", totalPrice);
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}
