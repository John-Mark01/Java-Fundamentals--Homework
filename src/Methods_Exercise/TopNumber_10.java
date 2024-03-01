package Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n ; i++) {

            for (int j = 0; j <= i ; j++) {
                sum += j;
                String number = String.valueOf(sum);
                char[] convertedNumber = number.toCharArray();

                for (int k = 0; k < number.length() - 1 ; k++) {
                    int numbers = convertedNumber[k];
                    if (numbers % 2 != 0 && sum % 8 == 0) {
                        System.out.println(i);
                    }
                }

            }
        }
    }
}
