package associativeArrays.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();
        TreeMap<Integer, Integer> countsMap = new TreeMap<>();
        for(int num : numbersArr) {
            countsMap.putIfAbsent(num, 0);
            countsMap.put(num, countsMap.get(num) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countsMap.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
