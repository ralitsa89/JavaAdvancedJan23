package P01StacksAndQueues;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" ");

        Collections.reverse(Arrays.asList(expressionParts));

        for (String part : expressionParts) {
            stack.push(part);
        }
        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int second = Integer.parseInt(stack.pop());

            int result = 0;
            switch (op){
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                default:
                    System.out.println("Unknown operation" + op);
                    return;

            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
