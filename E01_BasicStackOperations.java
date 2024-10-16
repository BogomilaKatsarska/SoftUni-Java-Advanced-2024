package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E01_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int numElToPush = Integer.parseInt(input[0]);
        int numElToPop = Integer.parseInt(input[1]);
        int numCheckIfPresent = Integer.parseInt(input[2]);

        ArrayDeque<Integer> listOfNums = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

//        Collections.addAll(numbers, listOfNums);

        for (int number : numbers) {
            listOfNums.push(number);
        }
        for (int i=1; i<=numElToPop; i++){
            listOfNums.pop();
        }

        if (listOfNums.contains(numCheckIfPresent)){
            System.out.println("True");
        } else if (listOfNums.isEmpty()){
            System.out.println("0");
        } else {
            int smallestEl = Integer.MAX_VALUE;
            for (int i=0; i<listOfNums.size(); i++){
                int poppedEl = listOfNums.pop();
                if (poppedEl < smallestEl){
                    smallestEl = poppedEl;
                }
            }
            System.out.println(smallestEl);
        }
    }
}
