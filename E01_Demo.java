package JavaAdvanced;

import java.util.Scanner;

public class E01_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        doSomething(count);
    }

    private static void doSomething(int count) {
        System.out.println("DoSomethingNow!");
        count --;
        if (count == 0){
            return;
        }
        doSomething(count);
    }
}
