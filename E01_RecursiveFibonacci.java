package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E01_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int searchedIndex = Integer.parseInt(scanner.nextLine());

        Deque<Long> stack = new ArrayDeque<>();
        stack.push(1L);
        stack.push(1L);
        int currIndex = 1;

        while(currIndex != searchedIndex){
            long poppedElement = stack.pop();
            long peekedElement = stack.peek();
            long elementToBeAdded = poppedElement + peekedElement;
            stack.push(poppedElement);
            stack.push(elementToBeAdded);
            currIndex +=1;
        }
        System.out.println(stack.peek());
    }
}
