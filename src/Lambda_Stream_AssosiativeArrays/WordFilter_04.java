package Lambda_Stream_AssosiativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = Arrays.stream(scanner.nextLine()
                            .split(" "))
                            .filter(string -> string.length() % 2 == 0)
                            .toArray(String[]::new);


        for (String string : strings) {
            System.out.println(string);
        }
    }

}
