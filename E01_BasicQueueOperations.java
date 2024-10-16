package JavaAdvanced;

import java.util.*;

public class E01_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numsToOffer = numbers[0];
        int numsToPoll = numbers[1];
        int numToSearchFor = numbers[2];

        Deque<Integer> queue = new ArrayDeque<>();

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=0; i<input.length; i++){
            queue.offer(input[0]);
        }
        for(int i=0; i<numsToPoll; i++){
            queue.poll();
        }

        if (queue.contains(numToSearchFor)){
            System.out.println("true");
        } else if (queue.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(Collections.min(queue));
        }
    }
}
