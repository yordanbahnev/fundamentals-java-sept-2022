package TextProcessing.exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //масив с входните данни разделени с ", "
        String[] usernames = scanner.nextLine().split(", ");
        //проверяваме дали username-те са валидни
        for (String username : usernames) {
            if (isValidUsername(username))
                System.out.println(username);
        }
    }

    //метод, който проверява дали моят username е валиден
    // true - ако е валиден и false - ако не е
    public static boolean isValidUsername(String username) {

        // valid length - дължината трябва да е между 3 и 16
        //boolean isValidLength = username.length() >= 3 && username.length() <= 16;
if (username.length() < 3 || username.length() > 16) {
    return false;
}
        //valid content
        //boolean isValidContent = false;

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                //невалиден символ => невалиден username
                return false;
            } //isValidContent = true;
        }
            return true;
        }
    }

