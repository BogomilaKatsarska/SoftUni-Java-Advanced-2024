package JavaAdvanced;

import java.util.Scanner;

public class L02_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        fillMatrix(matrixA, scanner);

        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        fillMatrix(matrixB, scanner);

        boolean areMatricesEqual = areEqual(matrixA, matrixB);
        if (areMatricesEqual){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    private static boolean areEqual(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length){
            return false;
        }
        for (int row=0; row < matrixA.length; row++){
            for (int col=0; col < matrixA[row].length; col++){
                if (matrixA[row][col] != matrixB[row][col]){
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}