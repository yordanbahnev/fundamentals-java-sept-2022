package FInalExam;

import java.util.*;

public class RetakeTask3SecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String majorItem = "";
        Map<String, List<String>> mapStore = new HashMap<>();
        while (!command.equals("Go Shopping")) {

            //"Add->{Store}->{Item},{Item1},…{ItemN}"
            if (command.contains("->")) {
                String[] inputCommand = command.split("->");
                String action = inputCommand[0];


                if (action.equals("Add")) {
                    String store = inputCommand[1];
                    String itemData = inputCommand[2];
                    String[] item = itemData.split(",");


                    for (int i = 0; i < item.length; i++) {
                        String newItem = item[i];


                        if (!mapStore.containsKey(store)) {
                            mapStore.put(store, new ArrayList<>());

                        }
                        boolean isExistItems = false;
                        for (List<String> listItems : mapStore.values()) {
                            if (listItems.contains(newItem)) {
                                isExistItems = true;
                                break;
                            }
                        }
                        if (!isExistItems) {
                            mapStore.get(store).add(newItem);
                        }
                    }


                } else if (action.equals("Important")) {
                    String store = inputCommand[1];
                    String itemData = inputCommand[2];
                    String[] item = itemData.split(",");

                    for (int i = 0; i < item.length; i++) {
                        majorItem = item[i];
                        //System.out.println(newItem);

                        if (!mapStore.containsKey(store)) {
                            mapStore.put(store, new ArrayList<>());

                        }
                        boolean isExistItems = false;
                        for (List<String> listItems : mapStore.values()) {
                            if (listItems.contains(majorItem)) {
                                isExistItems = true;
                                break;
                            }
                        }
                        if (!isExistItems) {
                            mapStore.get(store).add(0, majorItem);
                        }
                    }

                } else if (action.equals("Remove")) {
                    String store = inputCommand[1];


                        if (mapStore.containsKey(store)) {
                            boolean isExistItems = false;
                            for (List<String> listItems : mapStore.values()) {
                                if (listItems.contains(majorItem)) {
                                    isExistItems = true;
                                    break;
                                }
                            }
                            if (!isExistItems) {
                                mapStore.remove(store);
                            }
                        }
                    }
                }
            command = scanner.nextLine();
            }
        mapStore.entrySet().stream().forEach( entry -> {
            System.out.printf("%s:%n", entry.getKey());
            entry.getValue().forEach(item -> System.out.println("- " + item));

        });

        }

    }



