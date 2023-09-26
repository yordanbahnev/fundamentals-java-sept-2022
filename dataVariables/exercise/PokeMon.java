package dataVariables.exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exFactor = Integer.parseInt(scanner.nextLine());
        int countPokes = 0;
        int firstPower = power;
        while(power>= distance) {
            power -= distance;
            countPokes++;//увеличаваме с едно
            if (power == firstPower / 2) {
                if (exFactor != 0) { // позволена аритметична операция,
                    // иначе дава грешка при изпълнение
                    power /= exFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPokes);
    }
}
                                            