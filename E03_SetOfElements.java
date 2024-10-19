package JavaAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E03_SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int nSetSize = input[0];
        int mSetSize = input[1];

        Set<Integer> nSet = new LinkedHashSet<>();
        Set<Integer> mSet = new LinkedHashSet<>();

        for(int i=0; i<nSetSize; i++){
            int num = Integer.parseInt(scanner.nextLine());
            nSet.add(num);
        }

        for(int i=0; i<mSetSize; i++){
            int num = Integer.parseInt(scanner.nextLine());
            mSet.add(num);
        }

        nSet.retainAll(mSet);

        nSet.forEach(n -> System.out.print(n + " "));
    }
}
