package Lambda_Stream_AssosiativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).toList();

        Map<Double, Integer> count = new TreeMap<>();

        for (Double num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, 0);
            }
            count.put(num, count.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> entry : count.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
