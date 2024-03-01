package Methods_Lecture;

import java.util.Scanner;

public class SignOfInteger_01 {

    public static void main(String[] args) {
        printNumber();
    }
    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0) {
            System.out.println("The number " + n + " is zero.");
        } else if(n > 0) {
            System.out.println("The number " + n + " is positive.");
        } else {
            System.out.println("The number " + n + " is negative.");
        }
    }
}
