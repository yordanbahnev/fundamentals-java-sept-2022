package FInalExam;

import java.util.Scanner;

public class RetakeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String skill = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("For Azeroth")) {
            String[] inputCommand = command.split("\\s+");
            String firstInputCommand = inputCommand[0];

                if (firstInputCommand.contains("GladiatorStance")) {
                    skill = skill.toUpperCase();
                    System.out.println(skill);

                } else if (firstInputCommand.contains("DefensiveStance")) {
                    skill = skill.toLowerCase();
                    System.out.println(skill);

                } else if (firstInputCommand.contains("Dispel")) {
                    int index = Integer.parseInt(inputCommand[1]);
                    String wordToReplace = inputCommand[2];
                    String substring = skill.substring(index, index + 1);
//                char[] charToReplace = wordToReplace.toCharArray();
                    if (index < skill.length() && index >= 0) {
                        skill = skill.replaceFirst(substring, wordToReplace);
                        System.out.println("Success!");
//                    char [] charArr = skill.toCharArray();
//                    charArr[index] = charToReplace;
                    } else {
                        System.out.println("Dispel too weak.");
                    }

                } else if (firstInputCommand.contains("Target")) {
                    String action = inputCommand[1];
                    if (action.equals("Change")) {
                        String firstSubstring = inputCommand[2];
                        String secondSubstring = inputCommand[3];
                        if (!skill.contains(firstSubstring)) {
                            System.out.println(skill);

                        } else if (skill.contains(firstSubstring)) {
                            skill = skill.replace(firstSubstring, secondSubstring);
                            System.out.println(skill);
                        }

                    } else if (action.equals("Remove")) {
                        String subs = inputCommand[2];

                        if (!skill.contains(subs)) {
                            System.out.println("Command doesn't exist!");
//                        while (index != -1) {
//                            index = skill.indexOf(substring);
//                            skill = skill.replace(substring, "");
//
//                        }


                        } else if (skill.contains(subs)) {
                            int index = skill.indexOf(subs);
                            int lentgth = subs.length();
                            skill = skill.replaceAll(subs, "");
                            System.out.println(skill);
                        }

                    }

                } else {
                    System.out.println("Command doesn't exist!");
                }
            command = scanner.nextLine();
        }
    }
}
