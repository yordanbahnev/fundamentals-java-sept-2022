package basicSyntax.lection;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        for (int i = 1; i <= n ; i++) {
            System.out.println( 2 * i -1);
            sumOdd += 2 * i -1;
        }
        System.out.printf("Sum: %d", sumOdd);
    }
}
