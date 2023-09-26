package Arrays.lection;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int evenSum = 0;
        int OddSum = 0;
        for (int element : numbersArr) {
            if (element % 2 == 0) {
                evenSum += element;
            } else {
                OddSum += element;
            }

        }
        System.out.println(evenSum - OddSum);
    }
}

