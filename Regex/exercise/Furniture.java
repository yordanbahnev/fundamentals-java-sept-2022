package Regex.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalSum = 0.0;
        List<String> furnitureList = new ArrayList<>();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)\\!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        while(!command.equals("Purchase")){
            Matcher matcher = pattern.matcher(command);

            if (matcher.find()){
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitureList.add(furnitureName);
                double currentSum = price * quantity;
                totalSum += currentSum;
            }
            command= scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(f -> System.out.println(f));
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
