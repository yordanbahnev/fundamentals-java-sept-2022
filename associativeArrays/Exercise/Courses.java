package associativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        //съдържа запис на курс -> имена на студенти
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        // съдържа запис на курс -> брой регистрирани студенти
        //Map<String, Integer> registerMap = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String courseName =  command.split(" : ")[0];
            String studentsName =  command.split(" : ")[1];
            //проверяваме имаме ли такъв курс
            if (!coursesMap.containsKey(courseName)) {
                //ако нямам -> създавам нов с празен списък
                coursesMap.put(courseName, new ArrayList<>());
            }
            //ако курсът е нов връща празен списък
            // ако е стар връща моментния списък с хора
            coursesMap.get(courseName).add(studentsName);

            command = scanner.nextLine();
        }
        coursesMap.entrySet().forEach(entry -> { System.out.println(entry.getKey() + ": " + entry.getValue().size());
        entry.getValue().forEach (studentsName -> System.out.println("-- " + studentsName));
        });
    }
}
