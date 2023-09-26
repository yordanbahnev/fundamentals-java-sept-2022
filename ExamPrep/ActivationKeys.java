package ExamPrep;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String [] wordsArr = command.split(">>>");
            String firstCommand = wordsArr[0];
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;

            switch (firstCommand) {
                case "Contains":
                    String secondContains = wordsArr[1];
                    //"{raw activation key} contains {substring}".
                    if (activationKey.contains(secondContains)) {
                        System.out.printf("%s contains %s%n", activationKey, secondContains);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String secondFlip = wordsArr[1];
                    startIndex = Integer.parseInt(wordsArr[2]);
                    endIndex = Integer.parseInt(wordsArr[3]);
                    substring = activationKey.substring(startIndex, endIndex);
                    if (secondFlip.equals("Upper")) {
                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                    } else {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    startIndex = Integer.parseInt(wordsArr[1]);
                    endIndex = Integer.parseInt(wordsArr[2]);
                    substring = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(substring,"");
                    System.out.println(activationKey);
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
