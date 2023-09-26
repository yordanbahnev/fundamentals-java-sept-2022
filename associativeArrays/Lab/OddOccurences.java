package associativeArrays.Lab;

import java.util.*;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] wordsArr = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();
        for (String word : wordsArr) {
            word = word.toLowerCase();
            countMap.putIfAbsent(word, 0);
            countMap.put(word, countMap.get(word) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
//        for (int i = 0; i < resultList.size(); i++) {
//            System.out.print(resultList.get(i));
//            if(i < resultList.size() - 1) {
//                System.out.print(", ");
//            }
//
//        }

    }
}
