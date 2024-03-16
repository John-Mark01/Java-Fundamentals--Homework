package Regular_Expressions_Lecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "(?<countryCode>\\+359+)(?<delimiter>[-\\s]?)(?<areaCode>[2])\\2(?<number>[0-9]{3}\\2[0-9]{4})\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> phoneBook = new LinkedList<>();
        while (matcher.find()) {
            phoneBook.add(matcher.group());
        }

        System.out.println(String.join(", ", phoneBook));
    }
}
