package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Map<String, String> users = new LinkedHashMap<>();

        for (int count = 1; count <= n; count++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String user = input.split(" ")[1];



            switch (command) {
                case "register":
                    String licencePlate = input.split(" ")[2];
                    if (users.containsKey(user)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", licencePlate);
                    } else {
                        users.put(user, licencePlate);
                        System.out.printf("%s registered %s successfully\n", user, licencePlate);
                    }

                    break;
                case "unregister":

                    if (!users.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found\n", user);
                    } else {
                        users.remove(user);
                        System.out.printf("%s unregistered successfully\n", user);
                    }
                    break;
            }

        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
