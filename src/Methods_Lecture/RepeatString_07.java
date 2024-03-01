package Methods_Lecture;

import java.util.Scanner;

public class RepeatString_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int counts = Integer.parseInt(scanner.nextLine());

       String result = repeatString(string, counts);
        System.out.println(result);
    }

    public static String repeatString(String string, int count) {
        String newString = "";
        for (int i = 1; i <= count ; i++) {
            newString += string;
        }
        return newString;
    }
}
