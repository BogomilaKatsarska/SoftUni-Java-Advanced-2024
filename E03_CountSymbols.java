package JavaAdvanced;

import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E03_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        Map<Character, Integer> finalResult= new TreeMap<>();

        for(char symbol: input){
            if (finalResult.containsKey(symbol)){
                finalResult.put(symbol, finalResult.get(symbol) + 1);
            } else {
                finalResult.put(symbol, 1);
            }

        }
        for(Map.Entry<Character, Integer> entry: finalResult.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue() + " time/s");
        }
    }
}
