package associativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingUsers = new LinkedHashMap<>();

        for (int i = 0; i < numberCommands; i++) {
            String[] dataInput = scanner.nextLine().split(" ");
            String command = dataInput[0];
            String userName = dataInput[1];

            switch (command) {
                case "register":
                    String licensePLate = dataInput[2];
                    if (!parkingUsers.containsKey(userName)) {
                        parkingUsers.put(userName, licensePLate);
                        //"{username} registered {licensePlateNumber} successfully"
                        System.out.println(userName + " registered " + licensePLate + " successfully");
                    } else {
                        //"ERROR: already registered with plate number {licensePlateNumber}"
                        System.out.println("ERROR: already registered with plate number " + licensePLate);
                    }
                    break;

                case "unregister":
                    if (!parkingUsers.containsKey(userName)) {
                        System.out.println("ERROR: user " + userName + " not found");
                    } else {
                        parkingUsers.remove(userName);
                        System.out.println(userName + " unregistered successfully");
                    }
                    break;
            }
        }
        //•	"{username} => {licensePlateNumber}"
        parkingUsers.forEach((k, v) -> System.out.println(k + " => " + v));
            //parkingUsers.forEach((userName, licensePlate) -> System.out.println(userName + " => " + licensePlate));

    }
}
