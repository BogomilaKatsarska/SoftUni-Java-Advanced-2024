package JavaAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayerCards = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(number ->firstPlayerCards.add(number));
        Set<Integer> secondPlayerCards = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(number ->secondPlayerCards.add(number));

        int rounds = 50;
        while(rounds > 0 &&!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()){
            int firstPlayerCard = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstPlayerCard);
            int secondPlayerCard = firstPlayerCards.iterator().next();
            secondPlayerCards.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard){
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }
            rounds--;
        }
        if(firstPlayerCards.size() > secondPlayerCards.size()){
            System.out.println("First player wins");
        } else if (secondPlayerCards.size() > firstPlayerCards.size()){
            System.out.println("Second player wins");
        } else {
            System.out.println("Draw");
        }
    }
}
