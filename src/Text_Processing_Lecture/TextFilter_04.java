package Text_Processing_Lecture;

import java.util.Scanner;

public class TextFilter_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {

            String replacementWord = "*".repeat(bannedWord.length());
            text = text.replace(bannedWord, replacementWord);
        }

        System.out.println(text);
    }
}
