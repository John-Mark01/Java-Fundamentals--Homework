package Final_Exam;

import java.util.Scanner;

public class StringGame_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringToUse = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")) {

            String command = input.split(" ")[0];
            switch (command) {
                case "Change":
                    String characterToChange = input.split(" ")[1];
                    String replacementChar = input.split(" ")[2];
                    stringToUse = stringToUse.replaceAll(characterToChange,replacementChar);
                    System.out.println(stringToUse);
                    break;
                case "Includes":
                    String includeSubstring = input.split(" ")[1];
                    if (stringToUse.contains(includeSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                        break;
                case "End":
                    String endSubstring = input.split(" ")[1];
                    if (stringToUse.endsWith(endSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    stringToUse = stringToUse.toUpperCase();
                    System.out.println(stringToUse);
                    break;
                case "FindIndex":
                    char findChar = input.split(" ")[1].charAt(0);
                    int index = stringToUse.indexOf(findChar);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int count = Integer.parseInt(input.split(" ")[2]);

                    stringToUse = stringToUse.substring(startIndex);
                    stringToUse = stringToUse.substring(0, count);
                    System.out.println(stringToUse);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
