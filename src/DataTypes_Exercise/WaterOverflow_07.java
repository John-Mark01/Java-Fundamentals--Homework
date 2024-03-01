package DataTypes_Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long tankCapacity = 255;
        byte n = Byte.parseByte(scanner.nextLine());
        long sum = 0;


        for (int i = 1; i <= n ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
           if ((sum + liters) > tankCapacity) {
               System.out.println("Insufficient capacity!");
           } else {
               sum += liters;
           }
        }
        System.out.println(sum);
    }
}
