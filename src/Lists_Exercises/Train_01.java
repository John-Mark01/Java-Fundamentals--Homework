package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while(!input.equals("end")) {

            String[] command = input.split(" ");

            if (command.length > 1) {
                int passenger = Integer.parseInt(command[1]);
                wagons.add(passenger);
            } else {
                int passenger = Integer.parseInt(command[0]);
                for (int wagon = 0; wagon <= wagons.size() -1 ; wagon++) {
                    if (wagons.get(wagon) + passenger <= wagonCapacity) {
                        wagons.set(wagon, wagons.get(wagon) + passenger);
                        break;
                    }
                }
            }



            input = scanner.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }

}
