package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L01_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, tokens);
        while(stack.size() != 1) {
            String fistNumber = stack.pop();
            String operator = stack.pop();
            String secondNum = stack.pop();

            int result = 0;
            if (operator.equals("-")) {
                result = Integer.parseInt(secondNum) - Integer.parseInt(fistNumber);
            } else {
                result = Integer.parseInt(secondNum) + Integer.parseInt(fistNumber);
            }

            stack.push(String.valueOf(result));
        }
        System.out.println(stack.pop());
    }
}
