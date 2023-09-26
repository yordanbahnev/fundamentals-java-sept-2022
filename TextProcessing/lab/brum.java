package TextProcessing.lab;

import java.util.Date;
import java.util.Scanner;

public class brum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String Date = scanner.nextLine();
//        String fruits = "banana kiwi apple banana apple";
//        System.out.println(fruits.indexOf("banana"));
//        System.out.println(fruits.lastIndexOf("banana"));

//        System.out.println(new Date());
//
//        String text = "";
//        for (int i = 0; i < 1000000; i++)
//            text += "a";
//        System.out.println(new Date());
String word = scanner.nextLine();
String wordTwo = scanner.nextLine();
boolean isEqualString = word.equalsIgnoreCase(wordTwo);
if (isEqualString) {
    System.out.println("true");
}


    }
}
