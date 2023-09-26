package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sudents2 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public Student() {
            this.firstName = null;
            this.lastName = null;
            this.age = 0;
            this.homeTown = null;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
        @Override
        public String toString() {
            return String.format("%s %s is %d years old %n", this.getFirstName(), this.getLastName(), this.getAge());
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

            Student currentStudent = new Student (studentFirstName, studentLastName, studentAge, studentTown);

            int existingStudent = findStudent(studentList, currentStudent.getFirstName(), currentStudent.getLastName());
            if (existingStudent != -1 ) {
                studentList.get(existingStudent).setAge(currentStudent.getAge());
                studentList.get(existingStudent).setHomeTown(currentStudent.getHomeTown());
            }

            studentList.add(currentStudent);

            command= scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Student item : studentList) {
            if (item.getHomeTown().equals(searchTown)) {
                System.out.println(item);
            }
        }

    }
    public static int findStudent (List<Student> studentList, String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();
            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }

        }
        return -1;
    }
}
