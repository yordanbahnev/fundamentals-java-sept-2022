package basicSyntax.exercise;

import java.util.Scanner;

public class RangeExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входни данни
        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        // крайна сума = сумата от всички компонненти които са счупени
        int countHeadset = countLostGames / 2;
        int countMouse = countLostGames / 3;
        int countKeyboard = countLostGames / 6;
        int countDisplay = countLostGames / 12;
        double totalSum = (headSetPrice * countHeadset ) + (mousePrice * countMouse) + (keyboardPrice * countKeyboard) + (displayPrice * countDisplay);
        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
