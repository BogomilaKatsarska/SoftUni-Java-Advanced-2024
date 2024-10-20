package JavaAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E03_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> setOfWords = new LinkedHashSet<>();
        for (int i=0; i<n; i++){
            String input = scanner.nextLine();
            setOfWords.add(input);
        }
        setOfWords.forEach(word -> System.out.println(word));
    }
}
