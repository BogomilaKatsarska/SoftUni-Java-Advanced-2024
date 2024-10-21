package JavaAdvanced;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class L05_SupplierDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// lambda, which does not accept arguments, but returns value
        Supplier<Integer> getRandomInt = () -> new Random().nextInt(52);

        int rnd = getRandomInt.get();
        System.out.println(rnd);
    }
}
