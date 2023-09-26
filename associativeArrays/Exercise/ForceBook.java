package associativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        // запис: група(side)->списък (user)
        Map<String, List<String>> map = new LinkedHashMap<>();

        while(!command.equals("Lumpawaroo")) {
            //"{force_side} | {force_user}" валидна команда
            if(command.contains(" | ")) {
                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];
                //проверяваме дали нямаме такава група
                if(!map.containsKey(group)){
                    //създаваме група с празен списък
                    map.put(group, new ArrayList<>());
                }
                //имаме такава група -> добавяме към групата user ако го няма към Никоя Друга Група
                boolean isExistUser = false;// user  го има в дадена група
                //за всеки списък с user-и в списъка с всички списъци с user-и
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        // user го има в някоя група
                        isExistUser = true;
                        break;
                    }
                }
                if (!isExistUser) {
                    map.get(group).add(user);
                }

            //"{force_user} -> {force_side}" валидна команда
            } else if (command.contains(" -> ")){
                // разделяме командата на масив от думи разделени със ->
                String user = command.split("\\s+->\\s+")[0];
                String group = command.split("\\s+->\\s+")[1];
                //ако дадения user го има в някоя група го премахваме
                // вземаме всички записи пускаме forEach с което казваме искам да вземеш
                // всеки един запис/група вземаме списъка с user и искам да премахнем дадения user
                // запис: група/ключ/ -> списък с user-и /value/
                //първо премахваме от групата в която се намира
                // и след това го добавяме към новата група
                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                // след това проверяваме дали има такава група в която иска да отиде
                if ( map.containsKey(group)){
                    // вземаме списъка с user-те който стои срещу тази група
                    // и го добавяме там
                    map.get(group).add(user);
                } else {
                    //няма такава група в която иска да отиде
                    // -> следователно я създаваме

                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                //отпечатваме user-а който е добавен към дадена страна
                System.out.printf("%s joins the %s side!%n", user, group);
            }
            command= scanner.nextLine();
        }
        //филтрирам записите -> само тези при които списъка не е празен
        // тоест бр. хора > 0
        //дай ми всички записи -> пускаме стрийм -> филтрираме ( остава само този запис на който списъка с user-те е > 0)
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    //дай ми списъка с user-те пускаме foreach -> и казваме за всеки user
                    // ми отпечатай на отделен ред "! "+ "user"
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
