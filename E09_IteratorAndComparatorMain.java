package JavaAdvanced;

import java.util.*;
import java.util.stream.Collectors;

//following Car.java && CarComparator.java && Garage.java
public class E09_IteratorAndComparatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Car opel = new Car("Opel", 905);
         Car tesla = new Car("Tesla", 500, "2023");
         Car tesla2 = new Car("Tesla", 700, "2023", "WEFEFE9328423");

        System.out.println(opel.compareTo(tesla));
        List<Car> carList = new ArrayList<>();
        carList.add(opel);
        carList.add(tesla);
        carList.add(tesla2);
        carList.stream().sorted((car1, car2) -> car2.compareTo(car1))
                .forEach(System.out::println);
        CarComparator carComparator = new CarComparator();
        System.out.println(carComparator.compare(tesla, opel));

        carList.stream().sorted(new CarComparator()) // Pass an instance of CarComparator
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        Garage garage = new Garage(new Car[] {opel, tesla, tesla2});
        for (Car car : garage) {
            System.out.println(car);
        }
    }
}
