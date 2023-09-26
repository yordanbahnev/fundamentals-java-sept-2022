package ExamPrep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();
        //String newPassword = getCharsOnOddPositions(password);

        while (!command.equals("Done")) {
            if (command.equals("TakeOdd")) {
                password = getCharsOnOddPositions(password);
                System.out.println(password);
            } else if (command.contains("Cut")) {
                int indexCut = Integer.parseInt(command.split("\\s+")[1]);
                int lengthCut = Integer.parseInt(command.split("\\s+")[2]);
                //Cut index length - вземам под текст
                // от паролата от index с дължина length -> sustring(index, index +length)
                String subPassword = password.substring(indexCut, indexCut + lengthCut);
                password = password.replaceFirst(subPassword,"");
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];
                if (password.contains(substring)) {
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s%n", password);
    }

    private static String getCharsOnOddPositions(String password) {

        StringBuilder newPassword = new StringBuilder();
        for (int position = 0; position <= password.length() - 1; position++) {
            if (position % 2 != 0) {
                //char currentSymbol = password.charAt(position)
                newPassword.append(password.charAt(position));
            }
        }
        return newPassword.toString();
    }
}