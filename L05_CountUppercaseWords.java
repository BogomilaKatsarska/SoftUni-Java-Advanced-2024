package JavaAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L05_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // used in "filter"
        Predicate<String> startWithUpperCase = word -> Character.isUpperCase(word.charAt(0));

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).filter(startWithUpperCase).collect(Collectors.toList());
        System.out.println(words.size());
        words.forEach(word -> System.out.println(word));
    }
}
