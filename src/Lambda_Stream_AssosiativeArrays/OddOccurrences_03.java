package Lambda_Stream_AssosiativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String word : words) {
            String loweredCaseWord = word.toLowerCase();
            if (occurrences.containsKey(loweredCaseWord)) {
                occurrences.put(loweredCaseWord, occurrences.get(loweredCaseWord) + 1);
            } else {
                occurrences.put(loweredCaseWord, 1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i< odds.size() -1) {
                System.out.print(", ");
            }
        }
    }
}
