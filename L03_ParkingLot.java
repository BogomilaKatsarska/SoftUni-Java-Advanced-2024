package JavaAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L03_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> carNums = new LinkedHashSet<>();

        while(!input.equals("END")){
            String direction = input.split(", ")[0];
            String carNum = input.split(", ")[1];

            if (direction.equals("IN")){
                carNums.add(carNum);
            } else {
                carNums.remove(carNum);
            }
            input = scanner.nextLine();
        }
        if(carNums.isEmpty()){
            System.out.println("Parking lot is empty.");
        } else {
            for (String carNum: carNums){
                System.out.println(carNum);
            }
        }
    }
}
