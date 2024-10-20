package JavaAdvanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class L04_SortLines {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Softuni\\JavaAdvanced\\input.txt");
        List<String> lines = Files.readAllLines(path); //utility method

        Collections.sort(lines);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}