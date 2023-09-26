package Arrays.lection;

import java.util.Scanner;

public class arraysTaskOne {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        int [] numbersArr = new int [5];//създаваме масив от тип инт
//        // с пет елемента
//        for (int i = 0; i < numbersArr.length; i++) {
//
//        }
//        System.out.println();
        String values = scanner.nextLine();
        String [] valuesArr = values.split(" ");
        int [] numbersArr = new int[valuesArr.length];
        for (int i = 0; i < valuesArr.length; i++) {
            numbersArr[i] = Integer.parseInt(valuesArr[i]);

        }
        System.out.println();
    }
}
