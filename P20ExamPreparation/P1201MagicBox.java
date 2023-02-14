package P20ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P1201MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        int itemsWorth = 0;
        while (!queue.isEmpty() && !stack.isEmpty()){
            int firstItem = queue.peek();
            int secondItem = stack.pop();

            int sum = firstItem + secondItem;

            if (sum % 2 == 0){
                itemsWorth += sum;
                queue.poll();
            } else {
                queue.offer(secondItem);
            }
        }
        String emptyBoxOutput = queue.isEmpty() ? "First magic box is empty." : "Second magic box is empty.";

        String itemValueOutput = itemsWorth >= 90 ? "Wow, your prey was epic! Value: " : "Poor prey... Value: ";

        System.out.println(emptyBoxOutput);
        System.out.println(itemValueOutput + itemsWorth);
    }
}
