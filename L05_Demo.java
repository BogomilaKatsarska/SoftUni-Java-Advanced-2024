package JavaAdvanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0){
                System.out.print(nums.get(i) + " ");
            }
        }

        Collections.sort(nums);
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0){
                System.out.print(nums.get(i)+ " ");
            }
        }

    }
}
