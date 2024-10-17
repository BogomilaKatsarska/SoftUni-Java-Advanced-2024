package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class L02_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][4]; // 3rows and 4 cols

        int element = matrix[0][0];
        matrix[1] = new int[]{1, 2, 3, 4};
        for(int row=0; row < matrix.length; row++){
            for (int col=0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
