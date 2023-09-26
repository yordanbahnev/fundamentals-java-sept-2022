package ExamPrep;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, Double > rateMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] wordsArr = scanner.nextLine().split("<->");
            String plantName = wordsArr[0];
            int plantRarity = Integer.parseInt(wordsArr[1]);
            //plantRarityMap.putIfAbsent(plantName, 0);
            rateMap.put(plantName, 0.0);
            plantRarityMap.put(plantName, plantRarity);

        }
        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            //regex - го правим в regex101 като
            // проверяваме валидността с входните данни
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plantName = tokens[1];
            //double rating = Double.parseDouble(tokens[2]);

            if (!plantRarityMap.containsKey(plantName)){
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        //•	"Rate: {plant} - {rating}" –
                        // add the given rating to the plant (store all ratings)
                        double rate = Double.parseDouble(tokens[2]);

                        if (rateMap.get(plantName) == 0) {
                            rateMap.put(plantName, rate);


                        } else {

                            double newRate = (rateMap.get(plantName) + rate) /2 ;


                            rateMap.put(plantName, newRate);
                        }
                        break;

                    case "Update":
                        //•	"Update: {plant} - {new_rarity}" –
                        // update the rarity of the plant with the new one
                        int rarity = Integer.parseInt(tokens[2]);
                        plantRarityMap.put(plantName, rarity);
                        break;

                    case "Reset":
                        //•	"Reset: {plant}" –
                        // remove all the ratings of the given plant
                        rateMap.put(plantName, 0.0);
                        break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));

        }
    }
}
