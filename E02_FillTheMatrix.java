package JavaAdvanced;

import java.util.Scanner;

public class E02_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rowColCount = Integer.parseInt(input[0]);
        String matrixType = input[1];
        int[][] createdMatrix;

        if (matrixType.equals("A")){
            createdMatrix= createAMatrixA(rowColCount);
        } else {
            createdMatrix = createAMatrixB(rowColCount);
        }
        for(int row=0; row<createdMatrix.length; row++){
            for(int col=0; col<createdMatrix[row].length; col++){
                System.out.print(createdMatrix[row][col]+ " ");
            }
            System.out.println();
        }


    }

    private static int[][] createAMatrixB(int rowColCount) {
        int[][] createdMatrix = new int[rowColCount][rowColCount];
        int num=1;
        int col = 0;
        for(int i=1; i<=rowColCount; i++) {
            if (i%2 !=0) {
                for (int row = 0; row < rowColCount; row++) {
                    createdMatrix[row][col] = num;
                    num++;
                }
                col += 1;
            } else {
                for (int row = rowColCount-1; row >= 0; row--) {
                    createdMatrix[row][col] = num;
                    num++;
                }
                col += 1;
            }
        }
        return createdMatrix;
    }

    private static int[][] createAMatrixA(int rowColCount) {
        int[][] createdMatrix = new int[rowColCount][rowColCount];
        int num=1;
        int col = 0;
        for(int i=0; i<rowColCount; i++) {
            for (int row = 0; row < rowColCount; row++) {
                createdMatrix[row][col] = num;
                num++;
            }
            col += 1;
        }
        return createdMatrix;
    }
}
