package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.*;

public class StudentAcademy_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentInfo = new LinkedHashMap<>();

        for (int row = 1; row <= n ; row++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            studentInfo.putIfAbsent(studentName, new ArrayList<>());
            studentInfo.get(studentName).add(studentGrade);

        }

        for (Map.Entry<String, List<Double>> entry : studentInfo.entrySet()) {
            double averageGrade = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();

            if (averageGrade >= 4.5 ) {
                System.out.printf("%s -> %.2f\n", entry.getKey(), averageGrade);
            }
        }
    }
}
