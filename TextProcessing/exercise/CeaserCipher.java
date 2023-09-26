package TextProcessing.exercise;

import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        //StringBuilder encryptedCommand = new StringBuilder()
        for (char symbol : command.toCharArray()){
            //char encryptedSymbol = (char)(symbol + 3);
            //encryptedCommand.append(encryptedSymbol)
            System.out.print((char)(symbol + 3));
        }
        //System.out.println(encryptedCommand);

    }
}
