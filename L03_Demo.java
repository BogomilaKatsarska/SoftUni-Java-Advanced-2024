package JavaAdvanced;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class L03_Demo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(); //ordering is NOT guaranteed
        numbers.add(5);
        numbers.add(7);
        numbers.add(22);
        numbers.add(67);
        numbers.add(1);
        //LinkedHashSet - the order of appearance is preserved
        //TreeSet - elements are ordered incrementally

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(84);
        treeSet.add(20);
    }
}
