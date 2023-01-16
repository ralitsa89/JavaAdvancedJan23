package P03MultidimensionalArrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] parts = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[1]);

        int[][] data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] rowNums = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                data[i][j] =    Integer.parseInt(rowNums[j]);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
