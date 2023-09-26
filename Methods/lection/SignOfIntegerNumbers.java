package Methods.lection;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        printNumberSign(inputNumber);
        // това е аргумента на метода, който вземаме от конзолата
    }
    public static void printNumberSign(int num) {
        if( num > 0 ) {
            System.out.printf("The number %d is positive.", num);
        } else if ( num < 0 ) {
            System.out.printf("The number %d is negative.", num);
        } else if ( num == 0 ) {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
