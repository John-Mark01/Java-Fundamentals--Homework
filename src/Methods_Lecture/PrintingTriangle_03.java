package Methods_Lecture;

import java.util.Scanner;

public class PrintingTriangle_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n ; i++) {
            printTriangles(1, i);

        }
        for (int i = n; i >= 1; i--) {
            printTriangles(1, i);
        }
    }

    public static void printTriangles(int start, int end) {

        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
