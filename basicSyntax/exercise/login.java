package basicSyntax.exercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine(); // Acer -> recA
        String passWord = ""; // със ".length - вземаме броя на символите
        for (int index = userName.length() - 1; index >= 0; index--) {
            char currentSymbol = userName.charAt(index); // вземаме конкретен символ
            passWord += currentSymbol;
        }
        String enteredPass = scanner.nextLine();
        int countFailedPass = 0;
        while(!enteredPass.equals(passWord)) {
            countFailedPass ++;
            if(countFailedPass == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }
        if (enteredPass.equals(passWord)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
