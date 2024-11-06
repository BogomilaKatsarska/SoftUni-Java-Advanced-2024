package JavaAdvanced;

import java.util.Scanner;

public class L10_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        decrementAndPrintNumbers(10);
    }

    private static void decrementAndPrintNumbers(int number) {
        if (number == 0){ //end of recursion; base case
            return;
        }
        System.out.printf(number + " ");
        decrementAndPrintNumbers(number-1);
    }
}
