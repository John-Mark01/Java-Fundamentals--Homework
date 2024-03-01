package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(findVowels(input));
    }

    public static int findVowels(String input) {
        int count = 0;
        char[] string = input.toLowerCase().toCharArray();
        for (int i = 0; i < string.length ; i++) {
            if (string[i] == 'a' || string[i] == 'o'|| string[i] == 'e'|| string[i] == 'u'|| string[i] == 'i') {
                count++;
            }
        }
        return count;
    }
}
