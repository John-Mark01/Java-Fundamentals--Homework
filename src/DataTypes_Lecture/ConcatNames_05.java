package DataTypes_Lecture;

import java.util.Scanner;

public class ConcatNames_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.printf("%s%s%s", name1, delimiter, name2);
    }
}
