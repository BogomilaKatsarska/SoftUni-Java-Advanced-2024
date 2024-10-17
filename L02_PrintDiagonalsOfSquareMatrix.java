package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class L02_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[count][count];
        for (int i=0; i<count; i++){
            int[] currRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currRow;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row==col){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
        int col = 0;
        for (int row = matrix.length -1; row >= 0; row--) {
            System.out.print(matrix[row][col] + " ");
            col++;
        }
            }

    }

