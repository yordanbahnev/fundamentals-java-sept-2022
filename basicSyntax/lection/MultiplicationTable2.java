package basicSyntax.lection;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //{theInteger} X {times} = {product}
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        //int times;
        do {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);;
            multiplier++;
        } while ( multiplier <= 10);

        /* for (times = multiplier; times <= 10; times++) {
            int sum = number * times;
            System.out.printf("%d * %d = %d%n", number, times, sum);
        }
        if (multiplier > 10) {
            int newSum = number * multiplier;
            //sum = number * times;
            System.out.printf("%d * %d = %d%n", number, multiplier, newSum);*/
        }
}
