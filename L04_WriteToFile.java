package JavaAdvanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class L04_WriteToFile {
    public static void main(String[] args) throws IOException {
        String file = "C:\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(file);

        String pathToWrite = "C:\\output.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(pathToWrite);

        int oneByte = fileInputStream.read();
        char currChar = (char) oneByte;
        while (oneByte >= 0) {
            if (currChar != ',' && currChar != '.' && currChar != '!' && currChar != '?') {
                fileOutputStream.write(oneByte);
            }
            oneByte = fileInputStream.read();
        }
    }
}
