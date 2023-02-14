package P20ExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class P1602ReVolt {
    public static int playerRow;
    public static int playerCol;
    public static boolean hasWon = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());

        int commandsCount = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String matrixRow = scanner.nextLine();
            matrix[row] = matrixRow.toCharArray();

            if (matrixRow.contains("f")) {
                playerRow = row;
                playerCol = matrixRow.indexOf("f");
            }
        }
        while (commandsCount-- > 0 && !hasWon) {
            String command = scanner.nextLine();

            if (command.equals("up")) {
                movePlayer(matrix, -1, 0);
            } else if (command.equals("down")) {
                movePlayer(matrix, 1, 0);
            } else if (command.equals("left")) {
                movePlayer(matrix, 0, -1);
            } else if (command.equals("right")) {
                movePlayer(matrix, 0, 1);
            }
        }
        System.out.println(hasWon ? "Player won!" : "Player lost!");
        print(matrix);
    }

    private static void movePlayer(char[][] matrix, int rowMutator, int colMutator) {
        int nextRow = playerRow + rowMutator;
        int nextCol = playerCol + colMutator;

        if (isOutOfBounds(matrix, nextRow, nextCol)) {
            if (nextRow < 0 || nextRow >= matrix.length) {
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextCol < 0 ? matrix[nextRow].length - 1 : 0;
            }
        }
        if (matrix[nextRow][nextCol] == 'T') {
            return;
        } else if (matrix[nextRow][nextCol] == 'B') {
            matrix[playerRow][playerCol] = '-';
            playerRow = nextRow;
            playerCol = nextCol;
            moveBonus(matrix, rowMutator, colMutator);
            return;
        } else if (matrix[nextRow][nextCol] == 'F') {
            hasWon = true;
        }

        matrix[playerRow][playerCol] = '-';
        matrix[nextRow][nextCol] = 'f';
        playerRow = nextRow;
        playerCol = nextCol;
    }

    private static void moveBonus(char[][] matrix, int rowMutator, int colMutator) {
        int nextRow = playerRow + rowMutator;
        int nextCol = playerCol + colMutator;

        if (isOutOfBounds(matrix, nextRow, nextCol)) {
            if (nextRow < 0 || nextRow >= matrix.length) {
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextCol < 0 ? matrix[nextRow].length - 1 : 0;
            }
        }
        if (matrix[nextRow][nextCol] == 'F') {
            hasWon = true;
        }
        matrix[nextRow][nextCol] = 'f';
        playerRow = nextRow;
        playerCol = nextCol;
    }

    private static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;
    }

    private static void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
