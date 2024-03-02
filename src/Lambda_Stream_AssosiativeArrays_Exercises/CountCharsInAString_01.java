package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<Character, Integer> counts = new LinkedHashMap<>();


        for (int i = 0; i <= input.length-1; i++) {
            char[] word = input[i].toCharArray();
            for (int letter = 0; letter < word.length; letter++) {
                counts.putIfAbsent(word[letter], 0);
                counts.put(word[letter], counts.get(word[letter]) + 1);
            }
        }

        for (Map.Entry<Character, Integer> count: counts.entrySet()) {

            System.out.printf("%c -> %d\n", count.getKey(), count.getValue());
        }
    }
}