package FInalExam;

import java.util.*;
import java.util.function.DoubleFunction;

public class RetakeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> notepad = new HashMap<>();
        while (!command.equals("Go Shopping")) {
            String inputCommand = scanner.nextLine();
            String[] input = Arrays.stream(inputCommand.split("->")).filter(e -> e.trim().length() > 0).toArray(String[]::new);
            //inputCommand.split("[(-> )]+")
            String first = input[0];
            String stores = input[1];
            String items = String.valueOf(input[2].split("\\,"));
            if (first.equals("Add")) {

                if (notepad.containsKey(stores)) {
                    notepad.putIfAbsent(stores, new ArrayList<>());
                }
                //notepad.put(stores, Collections.singletonList(items));
                boolean isExistItems = false;
                for (List<String> listItems : notepad.values()) {
                    if (listItems.contains(items)) {
                        isExistItems = true;
                        break;
                    }
                }
                if (!isExistItems) {
                    notepad.get(stores).add(items);

                } else if (first.equals("Important")) {
                    String importantItem = input[2];
                    if (!notepad.containsKey(stores)) {
                        notepad.get(stores).add(importantItem);
                        continue;
                    }
                    isExistItems = false;
                    for (List<String> listItems : notepad.values()) {
                        if (listItems.contains(items)) {
                            isExistItems = true;
                            break;
                        }
                    }
                    if (!isExistItems) {
                        notepad.get(stores).add(items);

                    }

                } else if (first.equals("Remove")) {
                    if (notepad.containsKey(stores)) {
                        notepad.remove(stores);
                        if (notepad.containsValue("importantItem")) {
                            continue;
                        }
                    }

                }

                command = scanner.nextLine();
            }
            for (Map.Entry<String, List<String>> entry : notepad.entrySet()) {
                System.out.printf("%s:%n", entry.getKey());
                System.out.printf("- %s%n", entry.getValue());
            }

        }
    }
}
