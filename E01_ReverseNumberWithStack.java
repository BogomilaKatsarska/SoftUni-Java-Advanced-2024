package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E01_ReverseNumberWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Deque<Integer> output = new ArrayDeque<>();

        for (String s : input) {
            output.push(Integer.parseInt(s));
        }
        while(!output.isEmpty()){
            System.out.print(output.pop() + " ");
        }

    }
}
