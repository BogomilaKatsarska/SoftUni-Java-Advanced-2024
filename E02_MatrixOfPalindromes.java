package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class E02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];
        int firstAsciiChar = 97;
        int startEndAsciiChar = 97;


        String[][] matrix = new String[rows][cols];

        for (int row=0; row<rows; row++){
            String[] currRow = new String [cols];
            for(int col=0; col<cols; col++){
                String currString = Character.toString((char)startEndAsciiChar) +
                        Character.toString((char)(firstAsciiChar+col)) +
                        Character.toString((char)startEndAsciiChar);
                currRow[col] = currString;
            }
            matrix[row] = currRow;
            startEndAsciiChar ++;
            firstAsciiChar ++;
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
