package Lambda_Stream_AssosiativeArrays_Exercises;

import java.util.*;

public class Orders_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productsAndPrices = new LinkedHashMap<>();
        Map<String, Integer> productQuantities = new HashMap<>();

        while (!input.equals("buy")) {

           String product = input.split(" ")[0];
           double price = Double.parseDouble(input.split(" ")[1]);
           int quantity = Integer.parseInt(input.split(" ")[2]);

           productsAndPrices.putIfAbsent(product, 0.0);
           productQuantities.putIfAbsent(product, 0);

           productsAndPrices.put(product, price);
           productQuantities.put(product, productQuantities.get(product) + quantity);

            input = scanner.nextLine();
        }

        for (Map.Entry<String ,Double> entry : productsAndPrices.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue() * productQuantities.get(entry.getKey()));
        }
    }
}
