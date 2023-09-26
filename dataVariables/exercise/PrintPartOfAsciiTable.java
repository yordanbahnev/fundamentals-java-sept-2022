package dataVariables.exercise;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstAsciiCode = Integer.parseInt(scanner.nextLine());
        int secondAsciiCode = Integer.parseInt(scanner.nextLine());
        for (int code = firstAsciiCode; code <= secondAsciiCode ; code++) {
            System.out.print((char) code + " ");
        }
    }
}
