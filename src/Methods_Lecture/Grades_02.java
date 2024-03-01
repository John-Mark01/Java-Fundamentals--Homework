package Methods_Lecture;

import java.util.Scanner;

public class Grades_02 {

    public static void main(String[] args) {

        printGrade();
    }

    public static void printGrade() {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        if (number <= 2.99) {
            System.out.println("Fail");
        } else if (number <= 3.49) {
            System.out.println("Poor");
        } else if (number <= 4.49) {
            System.out.println("Good");
        } else if (number <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
