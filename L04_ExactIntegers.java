package JavaAdvanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L04_ExactIntegers {
    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {

        String path = "C:\\Softuni\\JavaAdvanced\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            }
            scanner.next();
        }
    }
}
