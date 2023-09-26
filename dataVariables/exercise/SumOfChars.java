package dataVariables.exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfSymbols = Integer.parseInt(scanner.nextLine());
        for (int symbol = 1; symbol <= numberOfSymbols ; symbol++) {
            char value = scanner.nextLine().charAt(0);
            // int code = (int) value -> може и да го пропуснем този ред и
            // да сумираме стойността директно както е показано по долу
            sum += (int) value;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
