package TextProcessing.exercise;

import java.util.Scanner;

public class LettersChangeNUmbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входни данни: scanner.nextLine() -> A12b s17G
        // .split("\\s+") -> ["A12b", "s17G"]
        String [] codes = scanner.nextLine().split("\\s+");
        double totalSum = 0;//сума от модифицираните числа
        for (String code : codes) {
            // код : буква число буква
            // модифицирам числото спрямо буквите
            double modifiedNumber = getModifiedNumber(code);
            //добавям към сумата
                    totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);

    }
    //метод, който връща модифицираното число от кода
    private static double getModifiedNumber(String code) {
        // код : буква число буква A12b
        char firstLetter = code.charAt(0); //'A'
        char secondLetter = code.charAt(code.length() - 1); //'b'
        double number = Double.parseDouble(code.replace(firstLetter, ' ')   // ' 12b'
                .replace(secondLetter, ' ') // ' 12 '
                .trim()); // '12' с trim премахваме излишните спейсове от текста

        // 1. проверяваме първата буква дали е главна ил малка
        if (Character.isUpperCase(firstLetter)) {
            //главна буква -> ascii е [65,90]
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        } else {
            //малка буква -> ascii е [97,120]
            //(int) firstLetter вземаме ascii кода на първата буква
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }
        // 2. проверяваме последната буква дали е главна или малка
        if (Character.isUpperCase(secondLetter)) {
            //главна буква -> ascii е [65,90]
            int positionUpperLetter = (int) secondLetter - 64;
            number -= positionUpperLetter;
        } else {
            //малка буква -> ascii е [97,120]
            //(int) secondLetter вземаме ascii кода на първата буква
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
