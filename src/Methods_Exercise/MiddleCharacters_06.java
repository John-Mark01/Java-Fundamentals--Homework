package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        findMiddleCharacter(input);
    }

    public static void findMiddleCharacter(String string) {
        String middleChars = "";
        if (string.length() % 2 == 0) {
            for (int index = (string.length() - 1) / 2; index <= (string.length() - 1) / 2 + 1; index++) {
                char[] characters = string.toCharArray();
                char character = characters[index];
                middleChars += character;
            }
        } else {
            for (int index = (string.length() - 1) / 2; index <= (string.length() - 1) / 2; index++) {
                char[] characters = string.toCharArray();
                char character = characters[index];
                middleChars += character;
            }

        }
        System.out.println(middleChars);
    }
}
