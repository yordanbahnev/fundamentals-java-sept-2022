package List.lection;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numberList.size() - 1; i++) {
            double currentNum = numberList.get(i);
            double nextNum = numberList.get(i + 1);
            if (currentNum == nextNum) {
                numberList.set(i, currentNum + nextNum);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElemByDelimiter(numberList," "));
    }

    public static String joinElemByDelimiter(List<Double> list, String delimiter) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {
            String numDf = decimalFormat.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }
}
