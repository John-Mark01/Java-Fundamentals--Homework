package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        createMatrix(n);
    }

    private static void createMatrix(int n) {

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }


}
