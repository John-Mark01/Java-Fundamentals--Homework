package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.*;

public class Courses_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            coursesMap.putIfAbsent(course, new ArrayList<>());
            coursesMap.get(course).add(student);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {

            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
            for (String student: entry.getValue() ) {
                System.out.println("-- " + student);
            }
        }
    }
}
