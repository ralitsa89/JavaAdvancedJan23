package P03MultidimensionalArrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] rowAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowAndCols[0]);
        int cols = Integer.parseInt(rowAndCols[1]);
        int[][] table = new int[rows][cols];

        for (int i = 0; i < table.length; i++) {
            String[] columnData = scanner.nextLine().split(", ");

            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = Integer.parseInt(columnData[j]);

            }
        }

        int maxSumTopLeftRow = -1;
        int maxSumTopLeftCol = -1;
        int maxSum = 0;
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table[i].length - 1; j++) {
                int currentSum = table[i][j] + table[i][j + 1]
                        + table[i + 1][j] + table[i + 1][j + 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumTopLeftRow = i;
                    maxSumTopLeftCol = j;
                }
            }
        }
        System.out.println(table[maxSumTopLeftRow][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(table[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);
    }
}
