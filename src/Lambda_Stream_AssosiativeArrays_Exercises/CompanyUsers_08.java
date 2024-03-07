package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.*;

public class CompanyUsers_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employee = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];


            employee.putIfAbsent(company, new ArrayList<>());
            if (!employee.get(company).contains(id)) {
                employee.get(company).add(id);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : employee.entrySet()) {

            System.out.println(entry.getKey());
            entry.getValue().forEach(id -> System.out.printf("-- %s\n", id));

        }
    }
}
