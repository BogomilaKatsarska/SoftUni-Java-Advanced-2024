package JavaAdvanced;
//Chech SmartArray.java
import java.util.ArrayList;

public class L07_SmartArrayMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(7);

//        System.out.println(arrayList.get(3));

        SmartArray smartArray = new SmartArray();

        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(3);
        smartArray.add(4);

        smartArray.forEach(number -> System.out.println(number));
    }
}
