package Methods.lection;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = Double.parseDouble(scanner.nextLine());
        double inputPower = Double.parseDouble(scanner.nextLine());
        double result = mathPower(inputNum, inputPower);
        DecimalFormat decFormat = new DecimalFormat("0.######");
        // с DecimalFormat принтираме стойности
        // след десетичната запетая ако има такива 14.456.
        // Ако са само нули се принтира цялото число 14.000.
        System.out.println(decFormat.format(result));
    }
    public static double mathPower (double num, double power) {
        double result = Math.pow(num, power);
        // с Math.pow увеличаваме на степен (променлива, степен с която увеличваме)
        return result;
    }
}
