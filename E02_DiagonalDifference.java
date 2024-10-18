package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class E02_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);

        int primaryDiagonalSum = getPrimaryDiagonalSum(matrix);
        int secondaryDiagonalSum = getSecondaryDiagonalSum(matrix);

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }

    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            int col = matrix.length - 1 - row;
            sum += matrix[row][col];
        }
        return sum;
    }

    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] currentRow = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(currentRow[col]);
            }
        }
    }

    private static void fillMatrix2(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
