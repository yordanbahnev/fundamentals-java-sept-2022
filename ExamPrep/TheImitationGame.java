package ExamPrep;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine(); //zzHe
        String command = scanner.nextLine(); // команди
        while(!command.equals("Decode")) {
            //ChangeAll|z|l
            //"Move {number of letters}":
            if (command.contains("Move")) {
                int lettersNum = Integer.parseInt(command.split("\\|")[1]);
                //String substring = encryptedMessage.substring(0, lettersNum);
                StringBuilder newPassword = new StringBuilder();
                for (int i = 0; i < lettersNum; i++) {
                    char symbol = encryptedMessage.charAt(i);
                    newPassword.append(symbol);
                }
//
                encryptedMessage = encryptedMessage.replace(newPassword, "");
                encryptedMessage += newPassword;

            } else if(command.contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];
                StringBuilder newPassword = new StringBuilder();
                newPassword.append(encryptedMessage);
                newPassword.insert(index, value);
                encryptedMessage = String.valueOf(newPassword);

            } else if (command.contains("ChangeAll")){
                String sustring = command.split("\\|")[1];
                String replacementWord = command.split("\\|")[2];
                encryptedMessage = encryptedMessage.replace(sustring,replacementWord);

            }

            command = scanner.nextLine();
        }
        //"The decrypted message is: {message}"
        System.out.printf("The decrypted message is: %s%n", encryptedMessage);
    }
}
