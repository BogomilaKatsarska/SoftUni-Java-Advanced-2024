package JavaAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L05_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> prices = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());
        Function<Double, Double> vatFunc = price -> price*1.2;

        System.out.println("Price with VAT:");

//        for(Double price: prices){
//            double priceWithVAT = vatFunc.apply(price);
//            System.out.printf("%.2f\n", priceWithVAT);
//        }
        Consumer<Double> printUpdatedP = price -> System.out.println(vatFunc.apply(price));
        for(double price: prices) {
            printUpdatedP.accept(price);
        }
        prices.forEach(printUpdatedP);
        System.out.println("FINAL:");
        //prices.stream().map(vatFunc).forEach(printUpdatedP);
    }
}
