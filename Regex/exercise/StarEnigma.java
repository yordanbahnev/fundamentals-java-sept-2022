package Regex.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messagesNum = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*:(?<population>[0-9]+)[^\\@\\-\\!\\:\\>]*\\!(?<attackType>[AD])\\![^\\@\\-\\!\\:\\>]*\\->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int count = 1; count <= messagesNum; count++) {
            //криптирано съобщение
            String encryptedMessage = scanner.nextLine();
            //чрез метод декриптитраме съобщението
            String decryptedMessage = getDecryptedMessage(encryptedMessage);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                //int population = Integer.parseInt(matcher.group("population"));;
                //int soldierCount = Integer.parseInt(matcher.group("soldierCount"));;
                String attack = matcher.group("attackType");
                if (attack.equals("A")) {
                    attackedPlanets.add(planetName);
                } else if (attack.equals("D")) {
                    destroyedPlanets.add(planetName);
                }
            }
        }
        //"Attacked planets: {attackedPlanetsCount}"
        //"-> {planetName}"
        //"Destroyed planets: {destroyedPlanetsCount}"
        //"-> {planetName}"
        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDecryptedMessage(String encryptedMessage) {

//        StringBuilder decryptedMessage = new StringBuilder();
        int countLetters = 0;
        for (char symbol : encryptedMessage.toCharArray()) {
          if (symbol == 's' || symbol == 'S' || symbol == 't' || symbol == 'T'
                    || symbol == 'a' || symbol == 'A' || symbol == 'r' || symbol == 'R') {
                countLetters++;
            }
//            char newSymbol = (char) (symbol - countLetters);
//            decryptedMessage.append(newSymbol);
        }
            StringBuilder decryptedMessage = new StringBuilder();
            for (char symbol : encryptedMessage.toCharArray()) {
                char newSymbol = (char) (symbol - countLetters);
                decryptedMessage.append(newSymbol);
            }
        return decryptedMessage.toString();
    }

//    private static int getSpecialLettersCount(String encryptedMessage) {
//        int countLetters = 0;
//        for (char symbol : encryptedMessage.toCharArray()) {
//            if (symbol == 's' || symbol == 'S' || symbol == 't' || symbol == 'T'
//                    || symbol == 'a' || symbol == 'A' || symbol == 'r' || symbol == 'R') {
//                countLetters++;
////            switch (symbol){
////                case 's':
////                case 'S':
////                case 't':
////                case 'T':
////                case 'a':
////                case 'A':
////                case 'r':
////                case 'R':
////                    countLetters++;
////                    break;
//            }
//        }
//        return countLetters;
//    }
}
