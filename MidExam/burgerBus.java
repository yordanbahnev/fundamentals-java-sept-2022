package MidExam;

import java.util.Scanner;

public class burgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cityNum = Integer.parseInt(scanner.nextLine());

        double tourProfit = 0.0;

        for (int i = 1; i <= cityNum; i++) {
            String cityName = scanner.nextLine();
            double cityIncome = Double.parseDouble(scanner.nextLine());
            double cityExpences = Double.parseDouble(scanner.nextLine());
            double cityProfit = 0.0;
            int currentCity = i;
            if (currentCity % 3 == 0 && currentCity % 5 == 0) {
                cityIncome = cityIncome * 0.90;
                cityProfit += cityIncome - cityExpences;
                tourProfit += cityProfit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, cityProfit);
            } else if (currentCity % 3 == 0) {

                cityExpences = cityExpences * 1.50;
                cityProfit += cityIncome - cityExpences;
                tourProfit += cityProfit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, cityProfit);

            } else if (currentCity % 5 == 0) {
                cityIncome = cityIncome * 0.90;
                cityProfit += cityIncome - cityExpences;
                tourProfit += cityProfit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, cityProfit);

            } else {
                cityProfit += cityIncome - cityExpences;
                tourProfit += cityProfit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, cityProfit);
            }
        }

        System.out.printf("Burger Bus total profit: %.2f leva.%n", tourProfit);
    }
}