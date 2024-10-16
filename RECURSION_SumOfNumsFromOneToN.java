package JavaAdvanced;

import java.util.Scanner;

public class RECURSION_SumOfNumsFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(calcSum(n));

    }

    private static int calcSum(int n) {
        if (n ==1){
            return 1;
        }
        return n + calcSum(n-1);
    }
}
