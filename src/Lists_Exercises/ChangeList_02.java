package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            switch (command) {

                case "Delete":
                    int numberToDelete = Integer.parseInt(input.split(" ")[1]);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == numberToDelete) {
                            list.remove(Integer.valueOf(numberToDelete));
                        }
                    }
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(input.split(" ")[1]);
                    int index = Integer.parseInt(input.split(" ")[2]);

                    list.add(index, numberToInsert);
                    break;
            }

            input = scanner.nextLine();
        }
        for (Integer integer : list){
            System.out.print(integer + " ");
        }

    }
}
