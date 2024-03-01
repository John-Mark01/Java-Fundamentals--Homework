package Arrays_Lecture;

import java.util.Scanner;

public class DayOfWeek_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        switch (n) {
            case 1:
                System.out.println(weekDay[0]);
                break;
                case 2:
                System.out.println(weekDay[1]);
                break;
                case 3:
                System.out.println(weekDay[2]);
                break;
                case 4:
                System.out.println(weekDay[3]);
                break;
                case 5:
                System.out.println(weekDay[4]);
                break;
                case 6:
                System.out.println(weekDay[5]);
                break;
                case 7:
                System.out.println(weekDay[6]);
                break;
            default:
                System.out.println("Invalid Day!");
        }

    }
}
