package Text_Processing_Exersice;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger multiplier = new BigInteger(scanner.nextLine());
        System.out.println(firstNum.multiply(multiplier));
    }
}
