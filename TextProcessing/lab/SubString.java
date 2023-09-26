package TextProcessing.lab;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String word = scanner.nextLine();
        int index = word.indexOf(wordToRemove);
        while (index != -1) {//while(word.contains(wordToRemove)
            word = word.replace(wordToRemove, "");
            index = word.indexOf(wordToRemove);
            // да пробвам и със:
            //закоментирам index = word.indexOf(wordToRemove);
            //принтирам в цикъла
            //System.out.println(word);
            //break;
        }
        System.out.println(word);

    }
}
