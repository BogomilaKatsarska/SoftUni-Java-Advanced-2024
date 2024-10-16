package JavaAdvanced;

import java.util.Scanner;

public class RECURSION_NthFibNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Fib nums: 0 1 1 2 3 5 8 13 21

        int nthIndex = Integer.parseInt(scanner.nextLine());

        System.out.println(findNthIndex(nthIndex));
    }
    private static int findNthIndex(int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        }
        return findNthIndex(n-1) + findNthIndex(n-2);
    }
}
