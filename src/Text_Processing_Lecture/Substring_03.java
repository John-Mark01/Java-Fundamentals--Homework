package Text_Processing_Lecture;

import java.util.Scanner;

public class Substring_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        int index = secondString.indexOf(firstString);


        while (index != -1) {
            secondString = secondString.replace(firstString, "");
            index = secondString.indexOf(firstString);
        }

        System.out.println(secondString);
    }
}
