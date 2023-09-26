package basicSyntax.exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sumFact = 0;
        while (number > 0) {
            int lastDigit = number % 10;//вземаме последната цифра
            // намираме факториел на ласт диджит
            int fact = 1;
            for (int i = 1; i <=lastDigit ; i++) {
                fact *= i;
            }
            number = number / 10; // намаляваме числото като премахваме последната цифрa
            sumFact += fact;
        }
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
