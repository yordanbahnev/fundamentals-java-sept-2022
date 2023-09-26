package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] inputData = command.split(" ");

            if (inputData[0].equals("Add")) { //команда "Add"
                int passenegers = Integer.parseInt(inputData[1]);
                wagonsList.add(passenegers);
            } else { //команда число
                int addPassengers = Integer.parseInt(inputData[0]);

                for (int i = 0; i < wagonsList.size(); i++) {
                    int currentWagon = wagonsList.get(i);
                    if (currentWagon + addPassengers <= maxWagonCapacity) {
                        wagonsList.set(i, currentWagon + addPassengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
//        for (Integer wagon : wagonsList) {
//            System.out.print(wagon + " ");
            wagonsList.forEach(wagon -> System.out.print(wagon + " "));
        }
    }

