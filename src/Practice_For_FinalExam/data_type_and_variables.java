package Practice_For_FinalExam;

import java.util.Scanner;

public class data_type_and_variables {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        int bestSnowball = 0;
        int bestQuality = 0;

        for (int snowball = 1; snowball <= n; snowball++) {

            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            int result = snowballSnow / snowballTime;

            if (result > bestSnowball) {
                bestSnowball = result;
                bestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %d (%d)", snowballSnow, snowballTime, bestSnowball, snowballQuality);
    }
}
