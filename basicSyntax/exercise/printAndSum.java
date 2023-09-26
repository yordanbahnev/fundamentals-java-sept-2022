package basicSyntax.exercise;

import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //въвеждам начална и крайна позиция
        // създавам променлива sum
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        // фор цикъл за да се изпълни повторението
        // сумираме
        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println(); // за да отпечатаме сумата на следвашия ред
        System.out.println("Sum: " + sum);
    }
    // ctrl + alt + L - подрежда кода !!!
}
