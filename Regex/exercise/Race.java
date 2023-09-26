package Regex.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namesParticipant = scanner.nextLine();
        List<String> namesList = Arrays.stream(namesParticipant.split(", ")).collect(Collectors.toList());
        //масив-"[George, Peter, Bill, Tom]".split(", ")
        //лист - {"George", "Peter", "Bill"," Tom"} list
        String input = scanner.nextLine();

        //състезател -> дистанция
        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        namesList.forEach(name -> racerDistances.put(name, 0));
        //REGEX
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        while (!input.equals("end of race")) {
            //input - G4e@55or%6g6!68e!!@
            // 1. име
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            //  Matcher - държа всички букви отговарящи на шаблона "[A-Za-z]+"
            while(matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            //2. дистанция
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            //Matcher - държа всички цифри отговарящи на шаблона "[0-9]"
            while (matcherDigits.find()){
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (namesList.contains(racerName.toString())) {
                //текущата дистанция избягана от състезателя
                int currentDistances = racerDistances.get(racerName.toString());
                racerDistances.put(racerName.toString(), currentDistances + distance);

            }
            input = scanner.nextLine();
        }
        List<String> top3Names = racerDistances.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));
        //БЕЗ СОРИТРОВКА
//        int count = 1;
//        for (Map.Entry < String, Integer > pair : racerDistances.entrySet()) {
//            //pair -> име и дистанция
//            if (count == 1){
//                System.out.println("1st place: " + pair.getKey());
//            count++;
//            } else if (count == 2){
//                System.out.println("2nd place: " + pair.getKey());
//                count ++;
//            } else if (count == 3) {
//                System.out.println("3rd place: " + pair.getKey());
//                break;
//            }
        }
    }


