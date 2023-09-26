package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	"Shadowmourne" - requires 250 Shards
        //•	"Valanyr" - requires 250 Fragments
        //•	"Dragonwrath" - requires 250 Motes
        Map<String, Integer> itemsMap = new LinkedHashMap<>();
        itemsMap.put("shards", 0);
        itemsMap.put("fragments", 0);
        itemsMap.put("motes", 0);
        Map<String, Integer> junkMap = new LinkedHashMap<>();
        boolean isWin = false;
        while (!isWin) {
            //String input = scanner.nextLine();
            String[] inputLine = scanner.nextLine().split(" ");
            for (int i = 0; i <= inputLine.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputLine[i]);
                String material = inputLine[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = itemsMap.get(material);
                    itemsMap.put(material, currentQuantity + quantity);
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int current = junkMap.get(material);
                        junkMap.put(material, current + quantity);
                    }
                }
                if (itemsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    itemsMap.put("shards", itemsMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (itemsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    itemsMap.put("fragments", itemsMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (itemsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    itemsMap.put("motes", itemsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        itemsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
