package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.*;

public class LegendaryFarming_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//  "Shadowmourne" - requires 250 Shards
//•	"Valanyr" - requires 250 Fragments
//•	"Dragonwrath" - requires 250 Motes

        Map<String, Integer> junkItems = new LinkedHashMap<>();
        Map<String, Integer> keyItems = new LinkedHashMap<>();
        keyItems.put("shards", 0);
        keyItems.put("fragments", 0);
        keyItems.put("motes", 0);

        boolean legendaryItemBought = false;

        while (!legendaryItemBought) {

            String input = scanner.nextLine();
            String[] materials = input.split(" ");

            for (int element = 0; element <= materials.length - 1; element += 2) {

                int quantity = Integer.parseInt(materials[element]);
                String elementName = materials[element + 1].toLowerCase();


                if (elementName.equals("shards") || elementName.equals("fragments") || elementName.equals("motes")) {

                        int newQuantity = keyItems.get(elementName) + quantity;
                        keyItems.put(elementName, newQuantity);
                } else {

                    if (!junkItems.containsKey(elementName)) {
                        junkItems.put(elementName, quantity);
                    } else {
                        junkItems.put(elementName, junkItems.get(elementName) + quantity);
                    }
                }

                for (Map.Entry<String, Integer> entry : keyItems.entrySet()) {

                    if (entry.getValue() >= 250) {
                        legendaryItemBought = true;
                        String winnerItem = entry.getKey();

                        if (winnerItem.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (winnerItem.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (winnerItem.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }

                        int newQuantity = entry.getValue() - 250;
                        keyItems.put(elementName, newQuantity);
                    }
                }

                if (legendaryItemBought) {
                    break;
                }
            }
        }
        keyItems.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
        junkItems.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }
}
