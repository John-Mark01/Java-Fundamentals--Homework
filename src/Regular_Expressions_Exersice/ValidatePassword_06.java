package Regular_Expressions_Exersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String passRegex = "_\\.+(?<pass>[A-Z][a-zA-Z0-9]{4,}[A-Z])_\\.+";
        Pattern passPattern = Pattern.compile(passRegex);
        

        for (int time = 1; time <= n ; time++) {
            String input = scanner.nextLine();
            Matcher passMatcher = passPattern.matcher(input);

            if (passMatcher.find()) {
                String password = passMatcher.group("pass");
                StringBuilder sbDigits = new StringBuilder();

                for (char symbol : password.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sbDigits.append(symbol);
                    }
                }

                if (sbDigits.length() == 0) {
                    System.out.println("Group: default");
                } else {
                    System.out.printf("Group: %s\n", sbDigits);
                }
            } else {
                System.out.println("Invalid pass!");

            }
        }
    }
}
