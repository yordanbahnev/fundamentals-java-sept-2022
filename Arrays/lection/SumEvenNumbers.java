package Arrays.lection;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String [] inputArr = scanner.nextLine().split(" ");
//        int [] numArr = new int (inputArr.length);
//        for (int i = 0; i < numArr.length; i++) {
//            numArr [i] = Integer.parseInt(inputArr[i]);
            int [] numArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            int evenSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currentEl = numArr[i];
            if (currentEl % 2 == 0) {
                evenSum += currentEl;
        }
        }
        System.out.println(evenSum);
    }
}
