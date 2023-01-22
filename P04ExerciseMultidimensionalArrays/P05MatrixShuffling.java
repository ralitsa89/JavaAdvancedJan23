package P04ExerciseMultidimensionalArrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String dimensionsInput = scanner.nextLine();
        int rows = Integer.parseInt(dimensionsInput.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensionsInput.split("\\s+")[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (validateCommand(command, rows, cols)) {
                String[] commandsPart = command.split("\\s+");
                int row1 = Integer.parseInt(commandsPart[1]);
                int col1 = Integer.parseInt(commandsPart[2]);
                int row2 = Integer.parseInt(commandsPart[3]);
                int col2 = Integer.parseInt(commandsPart[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printMatrix(matrix, rows, cols);

            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }

    private static boolean validateCommand(String command, int rows, int cols) {
        String[] commandsPart = command.split("\\s+");
        if (commandsPart.length != 5) {
            return false;
        }
        if (!commandsPart[0].equals("swap")) {
            return false;
        }
        int row1 = Integer.parseInt(commandsPart[1]);
        int col1 = Integer.parseInt(commandsPart[2]);
        int row2 = Integer.parseInt(commandsPart[3]);
        int col2 = Integer.parseInt(commandsPart[4]);

        if (row1 < 0 || row1 > rows || row2 < 0 || row2 > rows || col1 < 0 || col1 > cols || col2 < 0 || col2 > cols) {
            return false;
        }
        return true;
    }
}
