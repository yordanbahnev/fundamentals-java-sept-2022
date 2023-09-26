package ExamPrep;

import java.awt.image.ImageProducer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberHeroes = Integer.parseInt(scanner.nextLine());
    Map<String, Integer> heroHP = new LinkedHashMap<>();
    Map<String, Integer> heroMP = new LinkedHashMap<>();

        for (int i = 1; i <= numberHeroes ; i++) {
            String heroInfo = scanner.nextLine();
            String[] heroData = heroInfo.split("\\s+");
            String heroName = heroData[0];
            int hitPoints = Integer.parseInt(heroData[1]);
            int manaPoints = Integer.parseInt(heroData[2]);
            if (hitPoints <= 100) {
                heroHP.put(heroName, hitPoints);
            }
            if (manaPoints <= 200) {
                heroMP.put(heroName, manaPoints);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("CastSpell")){
                //"CastSpell – {hero name} – {MP needed} – {spell name}"
                String heroName = command.split("\\s+-\\s+")[1];
                int neededMP = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String spell = command.split("\\s+-\\s+")[3];
                int currentMP = heroMP.get(heroName);
                if (currentMP >= neededMP){
                    int leftMP = currentMP - neededMP;
                    heroMP.put(heroName, leftMP);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spell, leftMP);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spell);
                }

            } else if (command.contains("TakaDamage")) {
                //"TakeDamage – {hero name} – {damage} – {attacker}"
                String heroName = command.split("\\s+-\\s+")[1];
                int damageHP = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String attacker = command.split("\\s+-\\s+")[3];
                int currentHP = heroHP.get(heroName);
                currentHP -= damageHP;

                if (currentHP > 0) {
                    //жив
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damageHP, attacker, currentHP);
                    heroHP.put(heroName, currentHP);
                } else {
                    //умрял
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroHP.remove(heroName);
                    heroMP.remove(heroName);
                }

            }else if (command.contains("TakeDamage")) {
                //"TakeDamage – {hero name} – {damage} – {attacker}"
                String heroName = command.split("\\s+-\\s+")[1];
                int damageHP = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String attacker = command.split("\\s+-\\s+")[3];
                int currentHP = heroHP.get(heroName);
                currentHP -= damageHP;

                if (currentHP > 0) {
                    //жив
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damageHP, attacker, currentHP);
                    heroHP.put(heroName, currentHP);
                } else {
                    //умрял
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroHP.remove(heroName);
                    heroMP.remove(heroName);
                }

            } else if (command.contains("Recharge")){
                //"Recharge – {hero name} – {amount}"
                String heroName = command.split("\\s+-\\s+")[1];
                int amountMP = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                int currentMP = heroMP.get(heroName);
                currentMP += amountMP;
                if (currentMP > 200) {
                    currentMP = 200;
                }
                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMP - heroMP.get(heroName));
                    heroMP.put(heroName, currentMP);

            } else if (command.contains("Heal")) {
                //"Heal – {hero name} – {amount}"
                String heroName = command.split("\\s+-\\s+")[1];
                int amountHP = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                int currentHP = heroHP.get(heroName);
                currentHP += amountHP;
                if (currentHP > 100) {
                    currentHP = 100;
                }
                    System.out.printf("%s healed for %d HP!%n", heroName, currentHP - heroHP.get(heroName));
                    heroHP.put(heroName, currentHP);

            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : heroHP.entrySet()) {
            //for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            //            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
            //"{hero name}
            //  HP: {current HP}
            //  MP: {current MP}"
            System.out.printf("%s%n HP: %d%n MP: %d%n", entry.getKey(), entry.getValue(), heroMP.get(entry.getKey()));
        }

    }
}
