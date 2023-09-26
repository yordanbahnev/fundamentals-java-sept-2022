package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
//        BigInteger factNum = new BigInteger(String.valueOf(1));
        BigInteger factNum = calculateFactorial(inputNum);
//        for (int i = 1; i <= inputNum ; i++) {
//            factNum = factNum.multiply(BigInteger.valueOf(i));
        System.out.println(factNum);
    }
    public static BigInteger calculateFactorial(int number) {
        BigInteger factNum = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= number ; i++) {
            factNum = factNum.multiply(BigInteger.valueOf(i));
        }
        return factNum;
    }
}
