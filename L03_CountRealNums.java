package JavaAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L03_CountRealNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numberOccurrences = new LinkedHashMap<>();
        for (double value : values) {
            if (!numberOccurrences.containsKey(value)) {
                numberOccurrences.put(value, 1);
            } else {
                numberOccurrences.put(value, numberOccurrences.get(value) + 1);
            }

        }

        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
