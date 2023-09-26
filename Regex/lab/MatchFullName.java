package Regex.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        //вариант е да се изпише шаблона директно на долния ред
        // вместо да се създава променлива 'regex'
        //Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Pattern pattern = Pattern.compile(regex);// шаблон

        Matcher matcher = pattern.matcher(text);// текстовете от променливата text,
        //които отговарят на шаблона
        //matcher = {Ivan Ivanov, Georgi Georgiev}
        //List<String> names = new ArrayList<>();
        // лист се създава с цел да запишем имената в списък
        // и да го сортираме и така да се принтира
        while(matcher.find()) { // обхождаме текстовете
          //  names.add(matcher.group());
            System.out.print(matcher.group() + ' ');// връща тескта който отговаря на шаблона
        }
        //Collections.sort(names);
        //names.forEach(System.out::println);
    }
}
