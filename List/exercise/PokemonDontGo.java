package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split("\\+")).map(Integer::parseInt).
                collect(Collectors.toList());
        while(numbers.size() > 0) {

        }

    }
}
