package basicSyntax.lection;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //{theInteger} X {times} = {product}
        int number = Integer.parseInt(scanner.nextLine());
        int times = 1;
        while (times <= 10) {
            //по интуитивно с for ( times = 1; times <= 10; times ++) {
            int sum = number * times;
            System.out.printf("%d X %d = %d%n", number, times, sum);
            times++;
        }
    }
}