package JavaAdvanced;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2){
        return Integer.compare(car1.getHorsePower(), car2.getHorsePower());
    }
}
