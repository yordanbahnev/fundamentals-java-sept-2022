package FInalExam;

import java.util.Locale;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split("\\s+");
            if(command.contains("Translate")) {
                String symbol = commandArr[1];
                String replacementWord = commandArr[2];
                inputText = inputText.replace(symbol,replacementWord);
                System.out.println(inputText);
            // String word = scanner.nextLine();
                //String wordTwo = scanner.nextLine();
                //boolean isEqualString = word.equalsIgnoreCase(wordTwo);
                //if (isEqualString) {
                //    System.out.println("true");
            } else if (command.contains("Includes")) {
                String substring = commandArr[1];
                boolean isEqualString = inputText.equalsIgnoreCase(substring);
                if (!isEqualString) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }

            } else if (command.contains("Start")) {
                String substring = commandArr[1];
                 boolean sub = inputText.equalsIgnoreCase(substring);
                if (!sub) { //(!inputText.startsWith("substring")){
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }

            } else if (command.contains("Lowercase")) {
                inputText = inputText.toLowerCase(Locale.ROOT);
                System.out.println(inputText);

            } else if (command.contains("FindIndex")) {
                String symbol = commandArr[1];
                System.out.println(inputText.lastIndexOf(symbol));

            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int count = Integer.parseInt(commandArr[2]);
                String substring = inputText.substring(startIndex,startIndex + count);
                inputText = inputText.replace(substring, "");
                System.out.println(inputText);

            }
            command = scanner.nextLine();
        }
        //System.out.println(inputText);
    }
}
