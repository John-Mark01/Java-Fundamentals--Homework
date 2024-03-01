package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
//            int number = Integer.parseInt(command);
                char[] convertedString = command.toCharArray();
                if (convertedString[0] == convertedString[convertedString.length - 1]) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }



            command = scanner.nextLine();
        }
    }
}
