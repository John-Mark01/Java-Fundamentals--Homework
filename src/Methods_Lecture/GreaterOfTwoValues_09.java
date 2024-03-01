package Methods_Lecture;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfValue = scanner.nextLine();

        switch (typeOfValue) {
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                System.out.println(maxInt(firstInt, secondInt));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(maxChar(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(maxString(firstString, secondString));
                break;
        }
    }

    public static int maxInt(int value1, int value2) {
        return Math.max(value1, value2);
    }

    public static char maxChar(char first, char second) {
        if (first > second) {
            return first;
        }
        return (char) second;
    }

    public static String maxString(String first, String second) {

        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
