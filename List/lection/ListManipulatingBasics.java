package List.lection;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulatingBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());
        String textInput = scanner.nextLine();
        while(!textInput.equals("end")) {
            String [] commandArr = textInput.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    listInput.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    listInput.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    listInput.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    listInput.add(indexToInsert, numToInsert);
                    break;
            }
            textInput = scanner.nextLine();
        }
        //System.out.println(listInput);
        System.out.println(listInput.toString().replaceAll("[\\[\\],]", ""));
    }
}
