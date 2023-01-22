package P05SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shopsMap = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            if (!shopsMap.containsKey(shop)) {
                shopsMap.put(shop, new LinkedHashMap<>());
                shopsMap.get(shop).put(product, price);
            }
            if (!shopsMap.get(shop).containsKey(product)) {
                shopsMap.get(shop).put(product, price);
            }
            input = scanner.nextLine();
        }

        for (String username : shopsMap.keySet()) {
            System.out.printf("%s->%n", username);
            Map<String, Double> current = shopsMap.get(username);

            current.entrySet().forEach(entry -> {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            });
        }
    }
}
