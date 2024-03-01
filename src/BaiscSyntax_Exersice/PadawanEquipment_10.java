package BaiscSyntax_Exersice;

import java.util.Scanner;

public class PadawanEquipment_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double endSaber = Math.ceil(students * 1.10) * saberPrice;
        double endRobe = students * robePrice;
        double endBelt = (students - (students / 6)) * beltPrice;

        double totalSum = endBelt + endRobe + endSaber;


        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(budget - totalSum));
        }
    }

}
