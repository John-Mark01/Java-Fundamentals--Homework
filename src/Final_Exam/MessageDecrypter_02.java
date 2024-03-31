package Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        String regex = "\\A(?<delimiter>[$|%])(?<tag>[A-Z][a-z]{3,})\\1: \\[(?<char1>[0-9]+)\\]\\|\\[(?<char2>[0-9]+)\\]\\|\\[(?<char3>[0-9]+)\\]\\|\\z";

        Pattern pattern = Pattern.compile(regex);

        for (int count = 1; count <= n; count++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Valid message not found!");
            } else {
                String tag = matcher.group("tag");
                int firstChar = Integer.parseInt(matcher.group("char1"));
                int secondChar = Integer.parseInt(matcher.group("char2"));
                int thirdChar = Integer.parseInt(matcher.group("char3"));


                System.out.printf("%s: %c%c%c\n", tag, firstChar, secondChar, thirdChar);
            }
        }
    }

}
