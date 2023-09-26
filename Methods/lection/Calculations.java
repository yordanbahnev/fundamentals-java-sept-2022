package Methods.lection;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNumIn = Integer.parseInt(scanner.nextLine());
        int secondNumIn = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "add":
                addNumbers(firstNumIn, secondNumIn);
                break;
            case "multiply":
                multiplyNum(firstNumIn, secondNumIn);
                break;
            case "subtract":
                subtractNum(firstNumIn, secondNumIn);
                break;
            case "divide":
                divideNum(firstNumIn, secondNumIn);
                break;
        }
    }

    public static void addNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void multiplyNum(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void subtractNum(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void divideNum(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
