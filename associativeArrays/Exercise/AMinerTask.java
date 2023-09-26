package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static <K, V> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> commandQuantity = new LinkedHashMap<>();
        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            //if(!map.containsKey(group)){
            //                    //създаваме група с празен списък
            //                    map.put(group, new ArrayList<>());
            if ( !commandQuantity.containsKey(command)) {
                commandQuantity.put(command, quantity);
            } else {
                commandQuantity.put(command, commandQuantity.get(command) + quantity);
            }
            command = scanner.nextLine();
        }
        //различни начини за отпечатване
        for (Map.Entry<String, Integer> entry : commandQuantity.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());

            //commandQuantity.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

            //commandQuantity.forEach((k, v) -> System.out.println(k + "->" + v));
//
//        for (Map.Entry<String, Integer> entry : commandQuantity.entrySet()) {
//            //System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue())
//            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
