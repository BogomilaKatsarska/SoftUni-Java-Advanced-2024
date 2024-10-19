package JavaAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> setOfEls = new TreeSet<>();

        for(int i=0; i<n; i++){
            String[]input = scanner.nextLine().split(" ");
            for(String element: input){
                setOfEls.add(element);
            }
        }

        setOfEls.forEach(e -> System.out.println(e));
    }
}
