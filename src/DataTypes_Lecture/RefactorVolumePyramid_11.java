package DataTypes_Lecture;

import java.util.Scanner;

public class RefactorVolumePyramid_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());;
        System.out.print("Length: ");

        System.out.print("Width: ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double volume = Double.parseDouble(scanner.nextLine());
        volume = (lenght * height * volume) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
