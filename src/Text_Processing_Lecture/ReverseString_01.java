package Text_Processing_Lecture;

import java.util.Scanner;

public class ReverseString_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        sb.append(", Hey");
        System.out.println(sb.toString());
    }
}
