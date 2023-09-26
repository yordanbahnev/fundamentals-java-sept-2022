package Methods.exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        long factorialOne = calculateFactorial(numberOne);
        long factorialTwo = calculateFactorial(numberTwo);
        double factDivide = factorialOne * 1.0 / factorialTwo;
        System.out.printf("%.2f", factDivide);
    }

    public static long calculateFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number ; i++) {
            fact *= i;
            
        }
        return fact;
    }

}
