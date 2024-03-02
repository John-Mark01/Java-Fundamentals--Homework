package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.*;

public class AMinerTask_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(resource)) {
                resources.put(resource, resources.get(resource) + quantity);
            } else {
                resources.put(resource, quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
