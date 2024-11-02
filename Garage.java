package JavaAdvanced;

import java.util.Iterator;

public class Garage implements Iterable<Car>{
    private Car[] cars;

    public Garage(Car[] cars){
        this.cars = cars;
    }
    public Iterator<Car> iterator(){
        return new GarageIterator();
    }
    private class GarageIterator implements Iterator<Car>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < cars.length;
        }

        @Override
        public Car next() {
            Car car = cars[index];
            index++;
            return car;
        }
    }

}
