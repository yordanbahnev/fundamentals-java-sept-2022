package List.lection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(listOne.size(), listTwo.size());
        for (int i = 0; i < minSize; i++) {
            int numListOne = listOne.get(i);
            int numListTwo = listTwo.get(i);
            resultList.add(numListOne);
            resultList.add(numListTwo);
        }
        if (listOne.size() > listTwo.size()) {
            resultList.addAll(listOne.subList(minSize, listOne.size()));

        } else if (listTwo.size() > listOne.size()) {
            resultList.addAll(listTwo.subList(minSize, listTwo.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));

    }
}
