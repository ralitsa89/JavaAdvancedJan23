package P02ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder currentText = new StringBuilder();

        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("1")) {
                textStack.push(currentText.toString());
                String textToAppend = command.split("\\s+")[1];
                currentText.append(textToAppend);
            } else if (command.startsWith("2")) {
                textStack.push(currentText.toString());
                int count = Integer.parseInt(command.split(" ")[1]);
                int startIndexForDelete = currentText.length() - count;
                currentText.delete(startIndexForDelete, currentText.length());
            } else if (command.startsWith("3")) {
                int position = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentText.charAt(position - 1));
            } else if (command.equals("4")) {
                if (!textStack.isEmpty()) {
                    String last = textStack.pop();
                    currentText = new StringBuilder(last);
                }
            }
        }
    }
}
