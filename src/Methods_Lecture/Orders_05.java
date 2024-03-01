package Methods_Lecture;

import java.util.Scanner;

public class Orders_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity  = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
        }
        double result = calculatePrice(quantity, price);
        System.out.printf("%.2f",result);
    }

    public static double calculatePrice(int quantity, double price) {
        return quantity * price;
    }
}
