package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class L05_FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] bounds = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String condition = scanner.nextLine();
        if (condition.equals("odd")) {
            printNumbers(bounds, number -> number % 2 != 0);
        } else {
            printNumbers(bounds, number -> number % 2 == 0);
        }
    }

    private static void printNumbers(int[] bounds, Predicate<Integer> condition) {
        for (int number = bounds[0]; number <= bounds[1]; number++) {
            if (condition.test(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}