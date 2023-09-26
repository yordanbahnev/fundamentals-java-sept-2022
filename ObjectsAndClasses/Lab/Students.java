package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student (String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge () {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String command = scanner.nextLine();
        while(!command.equals("end")) {

            String [] studentDataArr = command.split("\\s+");
            String studentFirstName = studentDataArr[0];
            String studentLastName = studentDataArr[1];
            int studentAge = Integer.parseInt(studentDataArr[2]);
            String studentTown = studentDataArr[3];

            Student currentStudent = new Student(studentFirstName, studentLastName, studentAge, studentTown);
            studentList.add(currentStudent);

            command= scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentList) {
            if (item.getHomeTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old %n", item.firstName,item.getLastName(),item.age);
            }

        }

    }

}
