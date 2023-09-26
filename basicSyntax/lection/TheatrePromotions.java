package basicSyntax.lection;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean valid = true;
        if(dayType.equals("Weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122) ) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            } else {
                valid = false;
            }
        } else if (dayType.equals("Weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            } else {
                valid = false;
            }
        } else if (dayType.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            } else {
                valid = false;
            }
        }
        if ( !valid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
    // Option if we don't use a boolean variable and also don't write the last else condition with boolean check!
   //if ( price != 0) {
   //     System.out.printf("%d$", price);
   //     } else {
   //    System.out.println("Error!");
