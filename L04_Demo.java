package JavaAdvanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L04_Demo {
    public static void main(String[] args) throws IOException {

        String path = "C:\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);

        int oneByte = fileStream.read();
        while(oneByte >=0){
            System.out.println((char)oneByte);
            oneByte = fileStream.read();
        }
        fileStream.close();
    }
}
