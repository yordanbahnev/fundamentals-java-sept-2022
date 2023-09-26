package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> playerOneCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //{20 30 40 50}
        List<Integer> playerTwoCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //{10 20 30 40}

        //1. взимам първата карта от ръката
        //2. премахвам картата от ръката
        //3. проверка кой печели:
        // карта 1 > карта 2 -> слагам накрая на ръката на първия -> карта 1 -> карта 2
        //карта 2 > карта 1 -> слагам накрая на ръката на втория -> карта 2 -> карта 1
        //карта 1 == карта 2 -> не ги добавяме никъде

        //играта продължава когато и двамата имат карти
        //играта спира, когато някой остане без карти

        while (playerOneCards.size() != 0 && playerTwoCards.size() != 0) {
            int firstCard = playerOneCards.get(0);
            int secondCard = playerTwoCards.get(0);
            playerOneCards.remove(0);
            playerTwoCards.remove(0);

            if (firstCard > secondCard) {
                playerOneCards.add(firstCard);
                playerOneCards.add(secondCard);
            } else if (secondCard > firstCard) {
                playerTwoCards.add(secondCard);
                playerTwoCards.add(firstCard);
            }
        }

        //1. ако на първия му свършат картите
        if (playerOneCards.size() == 0) {
            //втория печели -> сума от картите на втория
            System.out.printf("Second player wins! Sum: %d", getCardsSum(playerTwoCards));
        }
        //2. ако на втория му свършат картите
        else if (playerTwoCards.size() == 0) {
            //първия печели
            System.out.printf("First player wins! Sum: %d", getCardsSum(playerOneCards));
        }
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}