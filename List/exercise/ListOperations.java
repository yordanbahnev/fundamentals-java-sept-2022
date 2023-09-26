package List.exercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numToAdd);
            } else if (command.contains("Insert")) {
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int index =Integer.parseInt(command.split(" ")[2]);

                if (isValidIndex(index, numbers)) {
                    numbers.add(index, numToInsert);
                } else {
                    System.out.println("Invalid index");
                }
//  43  20 5 1 23 29 18
            } else if (command.contains("Remove")) {
                //int indexForRemove = Integer.parseInt(command.split(" ")[1]);
                int indexForRemove = Integer.parseInt(command.split(" ")[1]);
                if (isValidIndex(indexForRemove, numbers)) {
                    numbers.remove(indexForRemove);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                int counter = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= counter ; i++) {
                    int firstNum = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNum);
                }
            } else if (command.contains("Shift right")) {
                int counter = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= counter; i++) {
                    int lastDigit = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastDigit);
                }
            }
            command = scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
    public static boolean isValidIndex (int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
