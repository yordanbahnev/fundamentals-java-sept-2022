package FInalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetakeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^(U\\$)(?<username>[A-Z][a-z]{2,})\\1(P@\\$)(?<password>[A-Za-z]{5,}[0-9]+)\\3$");
        int successfullRegs = 0;
        for (int i = 0; i < number; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            if (isValid(matcher)==true){
//if(matcher.find()) { без метода
                String username = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.println("Username: " + username + ", Password: " + password);
                successfullRegs++;
            }else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + successfullRegs);


    }

    private static boolean isValid(Matcher matcher) {
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
}
