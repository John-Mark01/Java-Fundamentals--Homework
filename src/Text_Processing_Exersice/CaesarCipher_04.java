package Text_Processing_Exersice;

import java.util.Scanner;

public class CaesarCipher_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        StringBuilder encription = new StringBuilder();

        for (char aChar : chars) {
            aChar += 3;
            encription.append(aChar);
        }
        System.out.println(encription.toString());
    }
}
