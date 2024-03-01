package DataTypes_Exercise;

import java.util.Scanner;

public class BeerKegs_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        double bigger = 0;
        String winner = "";

        for (int i = 1; i <= n ; i++) {
            String kegName = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double result = Math.PI * (height * Math.pow(radius, 2));

            if (result > bigger) {
                bigger = result;
                winner = kegName;
            }
        }
        System.out.println(winner);
    }
}
