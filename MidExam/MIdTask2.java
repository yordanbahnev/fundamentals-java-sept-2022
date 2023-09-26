package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MIdTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bookGenres = Arrays.stream(scanner.nextLine().split("\\s+\\|\\s+")).
                collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Stop!")) {
            String[] inputCommands = command.split("\\s+");
            String firstOne = inputCommands[0];
            if (firstOne.equals("Join")) {
                String secondOne = inputCommands[1];

                if (!bookGenres.contains(secondOne)) {
                    bookGenres.add(secondOne);
                }

            } else if (firstOne.equals("Drop")) {
                String secondOne = inputCommands[1];
                if (bookGenres.contains(secondOne)) {
                    bookGenres.remove(secondOne);
                }

            } else if (firstOne.equals("Replace")) {
                String secondOne = inputCommands[1];
                String thirdOne = inputCommands[2];
                if (bookGenres.contains(secondOne) && !bookGenres.contains(thirdOne)) {
                    bookGenres.set(bookGenres.indexOf(secondOne), thirdOne);
                    //bookGenres.remove(secondOne);
                }

            } else if (firstOne.equals("Prefer")) {
                int secondOne = Integer.parseInt(inputCommands[1]);
                int thirdOne = Integer.parseInt(inputCommands[2]);
                if (bookGenres.contains(secondOne) && bookGenres.contains(thirdOne)) {
                    int secondGenre = bookGenres.indexOf(secondOne);
                    int thirdGenre = bookGenres.indexOf(thirdOne);
                    bookGenres.set( secondGenre, String.valueOf(thirdOne));
                    bookGenres.set(thirdGenre, String.valueOf(secondOne));
                }
            }
            command = scanner.nextLine();
        }
        for (String bookGenre : bookGenres) {
            System.out.print(bookGenre + " ");
        }
    }

    public static boolean isValidIndex(int index, List<String> bookGenres) {
        return index >= 0 && index <= bookGenres.size() - 1;
    }
}
