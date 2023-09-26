package basicSyntax.lection;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"Name: {student name}, Age: {student age}, Grade: {student grade}".
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double  grade = Double.parseDouble(scanner.nextLine());
        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
        System.out.println(result);
        //System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
