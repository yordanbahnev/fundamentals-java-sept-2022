package Methods.exercise;

import java.util.Scanner;
public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);
        printCharactersInRange(symbolOne, symbolTwo);
    }
    public static void printCharactersInRange(char symbolOne, char symbolTwo) {
        if (symbolOne < symbolTwo) {
            for (char symbol = (char) (symbolOne + 1); symbol < symbolTwo; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (symbolTwo + 1); symbol < symbolOne; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
