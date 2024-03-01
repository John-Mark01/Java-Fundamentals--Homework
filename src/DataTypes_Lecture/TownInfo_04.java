package DataTypes_Lecture;

import java.util.Scanner;

public class TownInfo_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.",townName, population, area);
    }
}
