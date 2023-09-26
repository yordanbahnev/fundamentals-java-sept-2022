package FInalExam;


import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsPairs = scanner.nextLine().split("\\s+\\|\\s+");
        Map<String, List<String>> map = new TreeMap<>();
        for (String word : wordsPairs) {
            String[] wordDefinition = word.split("\\s+\\:\\s+");
            map.putIfAbsent(wordDefinition[0], new ArrayList<>());
            for (int i = 1; i < wordDefinition.length ; i++) {
                map.get(wordDefinition[0]).add(wordDefinition[i]);
            }
        }
        String[] wordArr = scanner.nextLine().split("\\s+\\:\\s+");
        for (String word : wordArr) {
            if (map.containsKey(word)) {
                System.out.println(word);
                map.get(word).stream().sorted(((e1,e2) -> Integer.compare(e2.length(), e1.length())))
                    .forEach(e -> System.out.println(String.format("-%s", e)));
            }
        }
        String output = scanner.nextLine();
        if (output.equals("Test")){
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.printf("%s:%n", entry.getKey());
            }


//            map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
//                    .forEach(entry -> {
//                        System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
//                        //дай ми списъка с user-те пускаме foreach -> и казваме за всеки user
//                        // ми отпечатай на отделен ред "! "+ "user"
//                        entry.getValue().forEach(user -> System.out.println("! " + user));
//                    });
        } else if (output.equals("Hand Over")) {
            map.forEach((key, value) -> System.out.println(String.format("%s ", key)));
            }

        }
//        if ("List".equals(output)) {
//            map.forEach((key, value) -> System.out.println(String.format("%s ", key)));
//        }

    }

