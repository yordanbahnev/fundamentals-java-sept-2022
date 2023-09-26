package List.lection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> nameList = new ArrayList<>();
        nameList.add("Vivi");
        nameList.add("IVii");
        for (int i = 0; i < nameList.size() ; i++) {
            System.out.println(nameList.get(i));

        }

    }
}
