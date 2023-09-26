package TextProcessing.exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int totalExplosionStrength = 0;
        for (int position = 0; position <= textBuilder.length() - 1; position++) {
            char currentSymbol = textBuilder.charAt(position);
            //char currentSymbol = textBuilder.charAt(position);
            if (currentSymbol == '>') {
                // с Integer.parseInt(textBuilder.charAt(position + 1) + "") казваме парсни ми към инт текста в скобите,
                // а текста в скобите получаваме като към символа прибавим празен текст ""
                 int explosionStrength = Integer.parseInt(textBuilder.charAt(position +1) + "");
                 totalExplosionStrength += explosionStrength;
            } else if (currentSymbol != '>' && totalExplosionStrength > 0) {
                textBuilder.deleteCharAt(position);
                totalExplosionStrength --;
                position --;
            }
        }
        System.out.println(textBuilder);
    }
}
