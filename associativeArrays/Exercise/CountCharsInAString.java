package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().replaceAll("\\s+", "");
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();
        for (char symbol : text.toCharArray()) {
            symbolsCount.putIfAbsent(symbol, 0);
            symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);
        }
        symbolsCount.entrySet().forEach(Entry -> System.out.println(Entry.getKey() + " -> " + Entry.getValue()));
    }
}
