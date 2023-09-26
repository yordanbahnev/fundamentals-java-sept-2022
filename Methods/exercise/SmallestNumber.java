package Methods.exercise;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFirstNum = Integer.parseInt(scanner.nextLine());
        int inputSecondNum = Integer.parseInt(scanner.nextLine());
        int inputThirdNum = Integer.parseInt(scanner.nextLine());
        printSmallestNumber(inputFirstNum, inputSecondNum, inputThirdNum);
    }
    public static void printSmallestNumber(int firstNum, int secondNum, int thirdNum) {
        int result = Math.min(firstNum,secondNum);
        int result2 = Math.min(secondNum,thirdNum);
        int total = Math.min(result,result2);
        System.out.println(total);
//        if (firstNum <= secondNum && firstNum <= thirdNum) {
//            System.out.println(firstNum);
//        } else if ( secondNum <= firstNum && secondNum <= thirdNum) {
//            System.out.println(secondNum);
//        } else if (thirdNum <= firstNum && thirdNum <= secondNum) {
//            System.out.println(thirdNum);
//        }
    }
}
