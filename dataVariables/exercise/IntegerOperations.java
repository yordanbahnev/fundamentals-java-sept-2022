package dataVariables.exercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());
        int sum = firstNum + secondNum;
        int sumDivede = sum / thirdNum;
        int sumMultiply = sumDivede * fourthNum;
        System.out.println(sumMultiply);
    }
}
