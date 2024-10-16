package JavaAdvanced;

import java.util.Scanner;

public class RECURSION_CalculateFactorial {
    private static int multiplication = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
         int result = calcFactorial(n);
        System.out.println(result);
    }

    private static int calcFactorial(int n) {
        if (n == 1){
            return multiplication;
        }
        multiplication *=n;
        n--;
        return calcFactorial(n);
    }
}
