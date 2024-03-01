package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        System.out.print(charactersInBetween(start, end));
    }

    public static String charactersInBetween(char start, char end) {
        String between = "";
//        int first = (int) start;
//        int last = (int) end;
        if (start < end) {
            for (int symbol = start + 1; symbol <= end - 1; symbol++) {
                between = between + (char) symbol + " ";
            }
        } else {
            for (int symbol = end + 1; symbol <= start - 1; symbol++) {
                between = between + (char) symbol + " ";
            }
        }

        return between;
    }
}
