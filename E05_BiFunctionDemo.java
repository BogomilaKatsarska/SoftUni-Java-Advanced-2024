package JavaAdvanced;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class E05_BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> sum = (x, y) -> "Sum is " + (x+y);

        System.out.println(sum.apply(5, 6));

        BiConsumer<String, String > printGreeting = (firstName, secondName) -> System.out.printf("Hi, my name is %s %s", firstName, secondName);
        printGreeting.accept("Bogomila", "Katsarska");

        BiPredicate<String, String> sameLen = (firstText, secondText) -> firstText.length() == secondText.length();
        System.out.println();
        System.out.println(sameLen.test("Bogomila", "Desi"));
    }
}
