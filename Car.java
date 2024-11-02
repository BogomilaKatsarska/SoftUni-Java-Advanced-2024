package JavaAdvanced;

import java.util.Comparator;

public class Car implements Comparable<Car>{
    private String model;
    private int horsePower;
    private String makeYear; //digits
    private String vehicleIdentificationNum;

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", makeYear='" + makeYear + '\'' +
                ", vehicleIdentificationNum='" + vehicleIdentificationNum + '\'' +
                '}';
    }

    public Car(String model, int horsePower, String... args){
        this.model = model;
        this.horsePower = horsePower;

        if (args.length == 1){
            if (args[0].length() == 4){
                this.makeYear = args[0];
            } else {
                this.vehicleIdentificationNum = args[0];
            }
        } else if (args.length == 2){
            if (args[0].length() == 4){
                this.makeYear = args[0];
                this.vehicleIdentificationNum = args[1];
            } else {
                this.makeYear = args[1];
                this.vehicleIdentificationNum = args[0];
            }
        }
    }
    public int compareTo(Car car){
        return Integer.compare(this.horsePower, car.horsePower);
    }
}
