package Lists_Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulationBasics_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] convertCommands = command.split(" ");
            String commandName = convertCommands[0];
            int commandIndex1 = Integer.parseInt(convertCommands[1]);

            switch (commandName) {
                case "Add":
                    numbers.add(commandIndex1);
                    break;
                case "Remove":
                    int numberToRemove = Integer.valueOf(commandIndex1);
                    numbers.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    numbers.remove(commandIndex1);
                break;
                case "Insert":
                    int commandIndex2 = Integer.parseInt(convertCommands[2]);
                    numbers.add(commandIndex2, commandIndex1);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
