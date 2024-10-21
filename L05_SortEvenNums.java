package JavaAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class L05_SortEvenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(text -> Integer.parseInt(text))
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));

    }
}
