package Methods.exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        //ДРУГ ВАРИАНТ НА ИЗПЪЛНЕНИЕ: String inputText = scanner.nextLine().toLowerCase;
        // printVowelsCount(inputText);
        //System.out.println(inputText.equalsIgnoreCase("scanner.nextLine")
        printVowelsCount(inputText.toLowerCase());
    }
    public static void printVowelsCount(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'i' || symbol == 'e' || symbol == 'o' || symbol == 'u') {
                count ++;
            }
        }
        System.out.println(count);
    }
}
