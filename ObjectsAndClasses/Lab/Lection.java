package ObjectsAndClasses.Lab;

import java.util.Random;

public class Lection {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LocalDate birthdayBaho = LocalDate.of(1988, 03, 07);
//        System.out.println(birthdayBaho);

        Random rnd = new Random();
        int rndNum = rnd.nextInt(99);
        System.out.println(rndNum);
    }
}
