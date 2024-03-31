package Final_Exam;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessagesManager_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> userData = new LinkedHashMap<>();

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            String[] commands = input.split("=");
            switch (commands[0]) {

                case "Add":
                    String addUsername = commands[1];
                    int sentMessages = Integer.parseInt(commands[2]);
                    int receivedMessages = Integer.parseInt(commands[3]);

                    userData.putIfAbsent(addUsername, new LinkedHashMap<>());
                    userData.get(addUsername).put("sent", sentMessages);
                    userData.get(addUsername).put("received", receivedMessages);

                    break;
                case "Message":
                    String sender = commands[1];
                    String receiver = commands[2];

                    if (userData.containsKey(sender) && userData.containsKey(receiver)) {
                        Map<String, Integer> senderStatistics = userData.get(sender);
                        Map<String, Integer> receiverStatistics = userData.get(receiver);

                        senderStatistics.put("sent", senderStatistics.getOrDefault("sent", 0)+ 1);
                        receiverStatistics.put("received", receiverStatistics.get("received") + 1);

                        if (senderStatistics.get("sent") + senderStatistics.get("received") >= capacity) {
                            userData.remove(sender);
                            System.out.printf("%s reached the capacity!\n", sender);
                        }
                        if (receiverStatistics.get("received") + receiverStatistics.get("sent") >= capacity) {
                            userData.remove(receiver);
                            System.out.printf("%s reached the capacity!\n", receiver);
                        }

                        userData.replace(sender, senderStatistics);
                        userData.replace(receiver, receiverStatistics);
                    }
                    break;
                case "Empty":
                    String usernameToRemove = commands[1];
                    if (usernameToRemove.equals("All")) {
                        userData.clear();
                    } else {
                        userData.remove(usernameToRemove);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Users count: " + userData.size());
        userData.forEach((name, stats) -> System.out.println(name + " - " + (stats.get("sent") + stats.get("received"))));
    }
}
