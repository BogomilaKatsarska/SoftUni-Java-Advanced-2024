package JavaAdvanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L05_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> countNums = list -> {
            int count = 0;
            for (Integer num: list){
                count += 1;
            }
            return count;
        };

        int count = countNums.apply(numbers);

        Function<List<Integer>, Integer> sumNums = list -> {
            int sum = 0;
            for(Integer num: list){
                sum += num;
            }
            return sum;
        };
        int sum = sumNums.apply(numbers);

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
    }
}
