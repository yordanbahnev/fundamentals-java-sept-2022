package TextProcessing.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");
        // hi abc abd
        //обхождаме масива
        //създаваме Лист за можем да долепим една към друга думите
        // при принтиране
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < wordsArr.length; i++) {
            //вземаме текущия елемент на масива
            String currentWord = wordsArr[i];
            //вземаме дължината на текущата дума(елемент от масива wordsArr)
            int length = currentWord.length();
            String repeatWord = repeatedString(currentWord, length);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));
    }

    private static String repeatedString(String word, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += word;
        }
        return result;
    }
//    public static String repeatedString(String text, int count) {
//        String result = "";
//        for (int i = 0; i < count; i++) {
//            result = result + text;
//        }
//        return result;
//    }

}
