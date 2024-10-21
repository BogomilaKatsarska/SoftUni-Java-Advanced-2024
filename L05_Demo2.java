package JavaAdvanced;

import java.util.List;
import java.util.function.Function;

public class L05_Demo2 {
    public static void main(String[] args) {

        // ламбда израз, който приема 1 аргумент и връща един резултат
        // <Input data type, Return data type>
        Function<Integer, Integer> funcPow = x -> x * x;
        Function<List<Integer>, Integer> sumNums = list -> {
            int sum = 0;
            for (Integer num: list){
                sum += num;
            }
            return sum;
        };

        System.out.println(funcPow.apply(6)); // .APPLY() method
    }
    //method, imperative code
    public static int pow(int x){
        return x*x;
    }
}
