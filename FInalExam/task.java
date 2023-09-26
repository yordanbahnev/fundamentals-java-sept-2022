package FInalExam;

import java.util.*;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // {words: definiton} | {words: definiton} | {words: definiton} ..
        String[] wordsPair = scanner.nextLine().split("\\s+\\|\\s+");
        Map<String, List<String>> noteBook = new LinkedHashMap<>();

        for (String word : wordsPair) {
            //{word}: {definiton}
            String[] text = word.split("\\:\\s+");
                  noteBook.put(text[0], new ArrayList<>());
            for (int i = 0; i < text.length; i++) {
                noteBook.get(text[0]).add(text[i]);
            }
        }

        String[] commandWords = scanner.nextLine().split("\\s+\\|\\s+");
        for (String command : commandWords) {
            String input = scanner.nextLine();
            if (input.equals("Test")) {
                if (noteBook.containsKey(command)){
                    for (Map.Entry<String, List<String>> entry : noteBook.entrySet()) {
                        System.out.printf("%s:%n -%s%n", entry.getKey(), entry.getValue());
                    }
                }

            } else if (input.equals("Hand Over")) {
                for (Map.Entry<String, List<String>> entry : noteBook.entrySet()) {
                    System.out.printf("%s%n",String.join(" ",entry.getKey()));
                }
            }
        }
    }
}
