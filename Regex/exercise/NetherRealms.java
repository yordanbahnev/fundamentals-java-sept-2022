package Regex.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String [] demonNames = input.split("[,\\s+]+");
        Map<String, Double> demonsHealth = new LinkedHashMap<>();
        Map<String, Double> demonsDamage = new HashMap<>();
        if (input.isEmpty()) return;
        for (String name : demonNames) {
            demonsHealth.putIfAbsent(name, 0.0);
            demonsDamage.putIfAbsent(name, 0.0);

            double health = getDemonHealth(name);
            double damage = getDemonsDamage(name);

            demonsHealth.put(name, health);
            demonsDamage.put(name, damage);
        }
        demonsHealth
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(value -> {double damage = demonsDamage.get(value.getKey());
            System.out.printf("%s - %.0f health, %.2f damage%n", value.getKey(),value.getValue(), damage);});
    }

    private static double getDemonHealth(String name) {
        double sum = 0.0;
        Pattern pattern = Pattern.compile("[^0-9+\\-*/.]");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()){
            char match = matcher.group().charAt(0);
            sum += match;
        }

        return sum;
    }

    private static double getDemonsDamage(String name) {
        double sum = 0.0;
        Pattern findDmg = Pattern.compile("(\\+{1}|\\-{1}(?=\\d))?\\d+\\.?\\d*");
        String [] arithmetic = name.split("[^/*]+");
        Matcher digits = findDmg.matcher(name);
        while (digits.find()){
            double digit = Double.parseDouble(digits.group());
            sum += digit;
        }
        for (String arithmeticSignCluster : arithmetic){
            char[] arithmeticSign = arithmeticSignCluster.toCharArray();
            for (char sign : arithmeticSign) {
                if (sign == '*') {
                    sum *= 2;
                } else if (sign == '/') {
                    sum /= 2;
                }
            }
        }
        return sum;
    }
}
