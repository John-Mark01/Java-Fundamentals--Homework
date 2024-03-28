package Text_Processing_Exersice;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder endString = new StringBuilder(input);


        for (int position = 0; position < endString.length() -1 ; position++) {
            if (endString.charAt(position) == endString.charAt(position + 1)) {
                endString.deleteCharAt(position + 1);
                position--;
            }
        }
        System.out.println(endString);
    }
}
