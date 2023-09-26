package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> spices = Arrays.stream(scanner.nextLine().split(",\\s+")).
                collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("done")) {
            String[] inputCommands = command.split("\\s+");
            String firstOne = inputCommands[0];

            if (firstOne.equals("AddSpice")) {
                String secondOne = inputCommands[1];
                if (!spices.contains(secondOne)) {
                    spices.add(secondOne);
                }

            } else if (firstOne.equals("AddManySpices")) {
                int secondOne = Integer.parseInt(inputCommands[1]);
                String[] thirdOne = inputCommands[2].split("\\|");
               //for (int i = 1; i <= thirdOne.length; i++) {
                    //spices.add(secondOne, String.format(String.valueOf(i)));
                    spices.addAll(secondOne, List.of(thirdOne));
              // }
// int secondOne = Integer.parseInt(inputCommands[1]);
//                int thirdOne = Integer.parseInt(inputCommands[2]);
//                if (bookGenres.contains(secondOne) && bookGenres.contains(thirdOne)) {
//                    int secondGenre = bookGenres.indexOf(secondOne);
//                    int thirdGenre = bookGenres.indexOf(thirdOne);
//                    bookGenres.set( secondGenre, String.valueOf(thirdOne));
//                    bookGenres.set(thirdGenre, String.valueOf(secondOne));
            } else if (firstOne.equals("SwapSpices")) {
                int index = Integer.parseInt(inputCommands[1]);
                int secondIndex = Integer.parseInt(inputCommands[2]);
                int firstSpice = spices.indexOf(index);
                int secondSpice = spices.indexOf(secondIndex);
                spices.set(index, String.valueOf(secondSpice));
                spices.set(secondIndex, String.valueOf(firstSpice));

//                spices.remove(inputCommands[1]);
//                spices.add(firstIndex, inputCommands[2]);

            } else if (firstOne.equals("ThrowAwaySpices")) {
                String secondOne = inputCommands[1];
                int numberOfSlices = Integer.parseInt(inputCommands[2]);
                int index = spices.indexOf(secondOne);
                if (spices.contains(secondOne)) {
                    for (int i = 1; i <= numberOfSlices ; i++) {
                        spices.remove(index);
                    }
                }

                } else if (firstOne.contains("Arrange")) {
                Collections.sort(spices);
            }
         command = scanner.nextLine();
        }
        for (String spice : spices) {
            System.out.print(spice + " ");
        }

    }
}
