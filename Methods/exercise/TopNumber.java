package Methods.exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 1; num <= n; num++) {
            if (isSumDivisibleBy8(num) && isConsistOfOddDigits(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isSumDivisibleBy8(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            //вземаме последната цифра
            int lastDigit = number % 10;
            // сумираме
            sumOfDigits += lastDigit;
            // премахвам от числото последната цифра и продължавам да
            // проверявам
            number = number / 10;
            // проверка на сумата за деление на 8
        }
        return sumOfDigits % 8 == 0;
        // връща true / false
        // с този ред спестяваме една if проверка
    }

    public static boolean isConsistOfOddDigits(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}

