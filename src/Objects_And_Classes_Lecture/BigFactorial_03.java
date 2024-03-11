package Objects_And_Classes_Lecture;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger("1");
        for (int number = 1; number <= n; number++) {
            factorial = factorial.multiply(BigInteger.valueOf(number));

        }

        System.out.println(factorial);
    }
}
