package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class L05_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bounds = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String condition = scanner.nextLine();
    }
}
