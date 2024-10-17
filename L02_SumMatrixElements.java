package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class L02_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++){
            int[] currRow = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = currRow;
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(getSum(matrix));
    }

    private static int getSum(int[][] matrix) {
        int sum = 0;
        for (int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                sum += matrix[row][col];
            }
        }
        return sum;
    }
}
