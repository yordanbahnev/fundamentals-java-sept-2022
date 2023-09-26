package ExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(\\#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern foodPattern = Pattern.compile(regex);
        Matcher matcher = foodPattern.matcher(text);
        int totalCalories = 0;
        int days = 0;
        StringBuilder output = new StringBuilder();
        while (matcher.find()){
            String food = matcher.group("foodName");
            String date = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            //"Item: {item name}, Best before:
            // {expiration date}, Nutrition: {calories}"
            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", food, date, calories));
        }
        days = totalCalories / 2000;
        //"You have food to last you for: {days} days!"
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(output);
    }
}
