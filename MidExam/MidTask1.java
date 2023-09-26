package MidExam;

import java.util.Scanner;

public class MidTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savedMoney = 0.0;
        int months = 1;
        double journeyMoney = Double.parseDouble(scanner.nextLine());
        double numberOfMonths = Double.parseDouble(scanner.nextLine());
        while(months <= numberOfMonths){
            if(months % 2 == 1 && months != 1) {
                savedMoney = savedMoney - (savedMoney * 0.16);
            }

            if (months % 4 == 0){
                savedMoney += savedMoney * 0.25;
            }
            savedMoney += journeyMoney * 0.25;
            months++;
        }
        if (savedMoney >= journeyMoney){
            double money = (savedMoney - journeyMoney);
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", money);
        }else {
            double money = (journeyMoney - savedMoney);
            System.out.printf("Sorry. You need %.2flv. more.",money);
        }

    }
}

