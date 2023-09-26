package FInalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String regex = "(?<symbols>.+)>(?<numbers>[0-9]{3})\\|(?<lowerCaseLetters>[a-z]{3})\\|(?<upperCaseLetters>[A-Z]{3})\\|(?<anySymbols>[^<>]{3})<(\\1)";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= number; i++) {
            String passWord = scanner.nextLine();
            Matcher matcher = pattern.matcher(passWord);
            if (matcher.find()) {
                int numbers = Integer.parseInt(matcher.group("numbers"));
                String lowerCaseLetters = matcher.group("lowerCaseLetters");
                String upperCaseLetters = matcher.group("upperCaseLetters");
                String symbols = matcher.group("anySymbols");

                System.out.println("Password: " + numbers + lowerCaseLetters + upperCaseLetters + symbols);
            } else if (!matcher.find()) {

                System.out.println("Try another password!");
            }

        }

    }
}
