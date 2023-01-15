package P02ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer>stack = new ArrayDeque<>();

        for (int i = 0; i < countCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            int number = Integer.parseInt(command[0]);
            switch (number){
                case 1:
                    int numbToPush = Integer.parseInt(command[1]);
                    stack.push(numbToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;

            }
        }
    }
}
