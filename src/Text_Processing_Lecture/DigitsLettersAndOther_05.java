package Text_Processing_Lecture;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int chars = 0; chars <= input.length() -1 ; chars++) {

            char character = input.charAt(chars);

            if (Character.isDigit(character)) {
                digits.append(character);
            } else if (Character.isLetter(character)) {
                letters.append(character);
            } else {
                symbols.append(character);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
