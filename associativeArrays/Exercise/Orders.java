package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{name} {price} {quantity}".
        String commandInput = scanner.nextLine();
        Map<String, Double> productsPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productsQuantityMap = new LinkedHashMap<>();
        while(!commandInput.equals("buy")) {
            //Beer 2.20 100 split " "
            String products = commandInput.split(" ")[0];
            double productPrice = Double.parseDouble(commandInput.split(" ")[1]);
            int productQuantity = Integer.parseInt(commandInput.split(" ")[2]);
            productsPriceMap.put(products, productPrice);

            if(!productsQuantityMap.containsKey(products)) {
                productsQuantityMap.put(products, productQuantity);
            } else {
                productsQuantityMap.put(products, productsQuantityMap.get(products) + productQuantity);
            }
            commandInput = scanner.nextLine();
        }
        //"{productName} -> {totalPrice}"
        for (Map.Entry<String, Double> entry : productsPriceMap.entrySet()) {
            // обща стойност на цената на продуктите
            // продукт * цена * количество
            String productName = entry.getKey();
            double totalSum = entry.getValue() * productsQuantityMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, totalSum);
        }



    }
}
