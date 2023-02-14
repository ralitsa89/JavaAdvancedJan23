package P20ExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class P1102CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] pastryShop = new String[size][size];
        int currentRow = 0;
        int currentCol = 0;

        int firstPillarRow = 0;
        int firstPillarCol = 0;

        int secondPillarRow = 0;
        int secondPillarCol = 0;

        boolean weFoundFirstPillar = false;
        for (int row = 0; row < size; row++) {
            String[] input = scanner.nextLine().split("");
            for (int col = 0; col < size; col++) {
                pastryShop[row][col] = input[col];

                if (pastryShop[row][col].equals("S")) {
                    currentCol = col;
                    currentRow = row;
                }
                if (pastryShop[row][col].equals("P") && !weFoundFirstPillar) {
                    firstPillarRow = row;
                    firstPillarCol = col;
                    weFoundFirstPillar = true;
                }
                if (pastryShop[row][col].equals("P") && weFoundFirstPillar) {
                    secondPillarRow = row;
                    secondPillarCol = col;
                }
            }
        }
        int money = 0;
        while (money < 50) {
            String command = scanner.nextLine();

            int oldRow = currentRow;
            int oldCol = currentCol;

            if (command.equals("left")) {
                currentCol--;
            }
            if (command.equals("right")) {
                currentCol++;
            }
            if (command.equals("up")) {
                currentRow--;
            }
            if (command.equals("down")) {
                currentRow++;
            }

            if (currentCol < 0 || currentRow < 0 || currentRow >= size || currentCol >= size) {
                pastryShop[oldRow][oldCol] = "-";
                break;
            }
            if (currentCol == firstPillarCol && currentRow == firstPillarRow) {
                currentCol = secondPillarCol;
                currentRow = secondPillarRow;
                pastryShop[oldRow][oldCol] = "-";
                pastryShop[firstPillarRow][firstPillarCol] = "-";
                pastryShop[currentRow][currentCol] = "S";
            } else if (currentCol == secondPillarCol && currentRow == secondPillarRow) {
                currentCol = firstPillarCol;
                currentRow = firstPillarRow;
                pastryShop[oldRow][oldCol] = "-";
                pastryShop[secondPillarRow][secondPillarCol] = "-";
                pastryShop[currentRow][currentCol] = "S";
            } else if (pastryShop[currentRow][currentCol].equals("-")) {
                pastryShop[oldRow][oldCol] = "-";
                pastryShop[currentRow][currentCol] = "S";
            } else {
                money += Integer.parseInt(pastryShop[currentRow][currentCol]);
                pastryShop[oldRow][oldCol] = "-";
                pastryShop[currentRow][currentCol] = "S";
            }
        }
        if (money >= 50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        } else {
            System.out.println("Bad news! You are out of the pastry shop.");
        }
        System.out.println("Money: " + money);
        print(size, pastryShop);
    }

    private static void print(int size, String[][] pastryShop) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(pastryShop[row][col]);
            }
            System.out.println();
        }
    }
}
