package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String operations = input.split(" ")[0];

            switch (operations) {

                case "Add":
                    int numberToAdd = Integer.parseInt(input.split(" ")[1]);
                    list.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(input.split(" ")[1]);
                    int atIndex = Integer.parseInt(input.split(" ")[2]);

                    if (atIndex >= 0 && atIndex < list.size()) {
                        list.add(atIndex, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(input.split(" ")[1]);

                    if (indexRemove >= 0 && indexRemove <= list.size()) {
                        list.remove(indexRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String leftOrRight = input.split(" ")[1];
                    int numberToShift = Integer.parseInt(input.split(" ")[2]);

                    if (leftOrRight.equals("left")) {
                        for (int index = 1; index <= numberToShift; index++) {
                            int firstIndex = list.get(0);
                            list.remove(0);
                            list.add(Integer.valueOf(firstIndex));

                        }
                    } else {
                        for (int index = 1; index <= numberToShift; index++) {
                            int lastIndex = list.get(list.size() -1);
                            list.remove(list.size() -1);
                            list.add(0, lastIndex);
                        }
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
