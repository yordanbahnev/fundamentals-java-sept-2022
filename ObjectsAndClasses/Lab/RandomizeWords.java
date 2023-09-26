package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] wordsArr = inputLine.split("\\s+");
        Random rndRotation = new Random();
        for (int i = 0; i < wordsArr.length; i++) {
            int indexX = rndRotation.nextInt(wordsArr.length);
            int indexY = rndRotation.nextInt(wordsArr.length);
            String oldWord = wordsArr[indexX];
            wordsArr[indexX] = wordsArr[indexY];
            wordsArr[indexY] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
