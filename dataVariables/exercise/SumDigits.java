package dataVariables.exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;
        while (number > 0) {
            sumDigits +=  number % 10;// взема последната цифра на въведеното число и я добавя към сумата
            number = number / 10; // маха последната цифра
//        for (int i = 1; i <=number; i++) {
//            int current = i;
            }
        System.out.println(sumDigits);

        }
    }

