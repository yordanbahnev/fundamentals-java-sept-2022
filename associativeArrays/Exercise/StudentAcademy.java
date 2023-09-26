package associativeArrays.Exercise;

import java.util.*;


public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());
            if (!studentsMap.containsKey(studentName)) {
                //studentsMap.putIfAbsent(studentName, Collections.singletonList(0.0));
                studentsMap.put(studentName, new ArrayList<>());
            }
            studentsMap.get(studentName).add(studentGrade);
        }
        Map<String, Double> averageStudentsGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            String name = entry.getKey();
            List<Double> gradeList = entry.getValue();
            double averageGrade = getAverageGrade(gradeList);
            if (averageGrade >= 4.50) {
                averageStudentsGrade.put(name, averageGrade);
            }
        }
        averageStudentsGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));



    }

    private static double getAverageGrade(List<Double> gradeList) {
        double sumGrades = 0;
        for (double grade : gradeList) {
            sumGrades += grade;
        }
        return sumGrades / gradeList.size();


    }
}
