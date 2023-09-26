package associativeArrays.Lab;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // хашмап <ключ-тип данни, стойност - тип данни> име = ню...
//        HashMap<String, Integer> airplanesMap = new HashMap<>();
//        //put -метод за въвеждане на item
//        airplanesMap.put("Boeing 737", 185);
        //                   ключ      , стойност
//        airplanesMap.put("Airbus A320", 252);
//
//        airplanesMap.remove("Boeing 737");
//        System.out.println();

//        LinkedHashMap<String, Double> fruitsMap = new LinkedHashMap<>();
//        fruitsMap.put("apple", 1.60);
//        fruitsMap.put("banana", 3.80);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for(int num : numbersArr){
            countMap.putIfAbsent(num, 0);
            countMap.put(num, countMap.get(num) +1);

//         if(!countMap.containsKey(num)) {
//             countMap.put(num, 0);
//         }
//         int value = countMap.get(num);
//         countMap.put(num, value + 1);
//        }
//        if (!countMap.containsKey(num)) {
//            countMap.put(num, 1);
//        } else {
//            int value = countMap.get(num);
//            countMap.put(num, value + 1);
//        }

        }

            LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();


        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {

            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
