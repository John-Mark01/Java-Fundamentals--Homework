package BasicSyntax_Lecture;

import java.util.Scanner;

public class TheatrePromotion_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (dayType) {
            case "Weekday":
                if (age <= 18) {
                    price = 12;
                } else if (age <= 64) {
                    price = 18;
                } else {
                    price = 12;
                }
                break;
            case "Weekend":
                if (age <= 18) {
                    price = 15;
                } else if (age <= 64) {
                    price = 20;
                } else {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age <= 18) {
                    price = 5;
                } else if (age <= 64) {
                    price = 12;
                } else {
                    price = 10;
                }
                break;
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.println(price + "$");
        }

    }
}
