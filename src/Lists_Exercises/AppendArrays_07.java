package Lists_Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Collections.*;

public class AppendArrays_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        reverse(elements);

        String output = elements.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replaceAll("\\s+", " ")
                .trim();

        //7 8 4 5 6 1 2 3
        System.out.println(output);
    }
}
