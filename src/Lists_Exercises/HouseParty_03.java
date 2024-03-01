package Lists_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commandCount = Integer.parseInt(scanner.nextLine());
        List<String> partyGuests = new ArrayList<>();

        String input = scanner.nextLine();
        while (commandCount != 0) {
            commandCount--;

            String[] command = input.split(" ");
            String name = command[0];

            if (command.length <= 3) {
                if (partyGuests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    partyGuests.add(name);
                }
            } else {
                if (!partyGuests.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    partyGuests.remove(name);
                }
            }

            if (commandCount == 0){
                break;
            }
            input = scanner.nextLine();
        }

        for (String guest : partyGuests) {
            System.out.println(guest);
        }
    }
}
