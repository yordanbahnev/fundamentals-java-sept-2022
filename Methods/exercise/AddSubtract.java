package Methods.exercise;

import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sumNumbers = sumOfNumbers(firstNumber, secondNumber);
        int subtractNumbers = sutractOfNumbers(sumNumbers, thirdNumber);
        System.out.println(subtractNumbers);
    }
    public static int sumOfNumbers(int first, int second) {
        return first + second;
    }
    public static int sutractOfNumbers(int first, int second) {
        return first - second;
    }
}
