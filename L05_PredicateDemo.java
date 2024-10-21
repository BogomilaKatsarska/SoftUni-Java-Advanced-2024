package JavaAdvanced;

import java.util.function.Predicate;

public class L05_PredicateDemo {
    public static void main(String[] args) {
        // lambda, which accepts 1 arg, and evalates a condition
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(6));
    }
}
