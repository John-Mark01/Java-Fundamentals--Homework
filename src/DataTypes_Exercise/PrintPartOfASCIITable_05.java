package DataTypes_Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      int start = Integer.parseInt(scanner.nextLine());
      int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end ; i++) {
            char character = (char) i;
            System.out.print(character + " ");
        }
    }
}
