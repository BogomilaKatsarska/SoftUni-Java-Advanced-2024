package JavaAdvanced;

import java.util.Scanner;

public class L02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(); //2, 3
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        boolean isNumFound = false;

        for (int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                matrix[row][col] = scanner.nextInt();
            }
        }
        int number = scanner.nextInt();
        for (int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                if(number == matrix[row][col]){
                    System.out.println(row + " " + col);
                    isNumFound = true;
                }
            }
        }

        if (isNumFound){
            System.out.println("Not found");
        }

    }
}
