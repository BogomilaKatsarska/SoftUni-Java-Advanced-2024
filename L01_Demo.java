package JavaAdvanced;


import java.util.ArrayDeque;
import java.util.Scanner;

public class L01_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Stack or queue - depends on the methods used
        //stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(scanner.nextLine()));
        stack.push(Integer.parseInt(scanner.nextLine()));
        stack.push(Integer.parseInt(scanner.nextLine()));
        stack.push(2);
        Integer elementToBePopped = stack.pop();
        Integer element = stack.peek();
        System.out.println(element);
        System.out.println(stack);
        //queue
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("Bogomila");
        queue.offer("Mila");
        queue.offer("Ivana");
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
