package P03MultidimensionalArrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] rowsAndCols = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] columnData = scanner.nextLine().split(" ");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(columnData[j]);

            }
        }
        int search = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search){
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
