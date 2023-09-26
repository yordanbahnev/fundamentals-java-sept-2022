package dataVariables.exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxVolume = Double.MIN_VALUE;// вземаме мин стойност при определяне на най-голямата такава
        int numberKegs = Integer.parseInt(scanner.nextLine());
        String maxKegModel = ""; //модел на кега с най-голям обем
        for (int i = 1; i <= numberKegs ; i++) {
            String modelOfKeg = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());
            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;
            // използваме Math библиотеката за да вземем стойността на ПИ и
            // Math функционалност за повдигане на степен(първо е променливата, степен с която повдигаме)
            if(kegVolume > maxVolume) {
                maxVolume = kegVolume;
                maxKegModel = modelOfKeg;
            }
        }
        System.out.println(maxKegModel);
    }
}
