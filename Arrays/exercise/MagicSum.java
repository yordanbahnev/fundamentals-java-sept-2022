package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNum = numbers[i];
            for (int j = i + 1; j <= numbers.length -1; j++) {
                int inCurrentNum = numbers[j];
                if (currentNum + inCurrentNum == magicNum) {
                    System.out.println(currentNum + " " + inCurrentNum);
                }

            }

        }
    }
}
