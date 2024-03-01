package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();
        passwordCheck(passwordInput);
    }

    public static void passwordCheck(String pass) {
        if (!lengthCheck(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!symbolsCheck(pass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitsCheck(pass)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (lengthCheck(pass) && digitsCheck(pass) && symbolsCheck(pass)) {
            System.out.println("Password is valid");
        }

    }
    public static boolean lengthCheck(String pass) {
        if (pass.length() < 6 || pass.length() > 10) {
            return false;
        }
        return true;
    }
    public static boolean digitsCheck(String pass) {
        int digitCount = 0;
        for (char symbol : pass.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }
        return true;
    }
    public static boolean symbolsCheck(String pass) {
        for (char symbol : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
}
