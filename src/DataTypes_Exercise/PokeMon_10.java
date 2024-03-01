package DataTypes_Exercise;

import java.util.Scanner;

public class PokeMon_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactor = Byte.parseByte(scanner.nextLine());

         int count = 0;
         int powerPercent = pokePower / 2;

        while (pokePower >= distance) {

            pokePower -= distance;

            count++;

            if (pokePower == powerPercent && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}

