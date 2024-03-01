package RandomizeWords_01;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random number = new Random();

        for (int word = 1; word <= words.length -1 ; word++) {
            System.out.println(words[number.nextInt(words.length)]);
        }

    }

}
