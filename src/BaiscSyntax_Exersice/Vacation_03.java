package BaiscSyntax_Exersice;

import java.util.Scanner;

public class Vacation_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerPerson = 0;

        if (typeOfPeople.equals("Students")) {
            switch (day) {
                case "Friday":
                    if (people >= 30) {
                        pricePerPerson = (8.45 * 0.85) * people;
                    } else {
                        pricePerPerson = 8.45 * people;
                    }
                    break;
                case "Saturday":
                    if (people >= 30) {
                        pricePerPerson = (9.80 * 0.85) * people;
                    } else {
                        pricePerPerson = 9.80 * people;
                    }
                    break;
                case "Sunday":
                    if (people >= 30) {
                        pricePerPerson = (10.46 * 0.85) * people;
                    } else {
                        pricePerPerson = 10.46 * people;
                    }
                    break;
            }
        } else if (typeOfPeople.equals("Business")) {
            switch (day) {
                case "Friday":
                    if (people >= 100) {
                        pricePerPerson = 10.90 * (people - 10);
                    } else {
                        pricePerPerson = 10.90 * people;
                    }
                    break;
                case "Saturday":
                    if (people >= 100) {
                        pricePerPerson = 15.60 * (people - 10);
                    } else {
                        pricePerPerson = 15.60 * people;
                    }
                    break;
                case "Sunday":
                    if (people >= 100) {
                        pricePerPerson = 16.00 * (people - 10);
                    } else {
                        pricePerPerson = 16.00 * people;
                    }
                    break;
            }
        } else {
            switch (day) {
                case "Friday":
                    if (people >= 10 && people <= 20) {
                        pricePerPerson = (15.00 * 0.95) * people;
                    } else {
                        pricePerPerson = 15.00 * people;
                    }
                    break;
                case "Saturday":
                    if (people >= 10 && people <= 20) {
                        pricePerPerson = (20.00 * 0.95) * people;
                    } else {
                        pricePerPerson = 20.00 * people;
                    }
                    break;
                case "Sunday":
                    if (people >= 10 && people <= 20) {
                        pricePerPerson = (22.50 * 0.95) * people;
                    } else {
                        pricePerPerson = 22.50 * people;
                    }
                    break;
            }
        }

        System.out.printf("Total price: %.2f", pricePerPerson);
    }
}
