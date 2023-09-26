package Arrays.exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] firstArr = new String [n];
        String [] secondArr = new String [n];
        for (int i = 1; i <= n ; i++) {
            String [] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers [0];
            String secondNum = numbers [1];
            if(i % 2 == 0 ) {
              secondArr [i-1] = firstNum;
              firstArr [i-1] = secondNum;
            } else{
                firstArr[i-1] = firstNum;
                secondArr[i-1] = secondNum;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
