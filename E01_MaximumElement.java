package JavaAdvanced;

import java.util.*;

public class E01_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i<n; i++){
            int[] command = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (command[0]==1){
                stack.push(command[1]);
            } else if (command[0]==2){
                stack.pop();
            } else if (command[0]==3){
                System.out.println(Collections.max(stack));
            }
        }
    }
}

