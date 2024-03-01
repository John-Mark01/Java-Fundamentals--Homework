package Objects_And_Classes_Lecture;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());

        System.out.println(first.add(second));
    }
}
