package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E05_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> appendSir = name -> System.out.println("Sir " + name);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(appendSir);
    }
}
