package P20ExamPreparation;

import java.util.*;

import static java.lang.System.in;

public class P1601Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> firstBoxQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();
        int loot = 0;

        String input = scanner.nextLine();
        Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .forEach(firstBoxQueue::offer);

        input = scanner.nextLine();
        Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .forEach(secondBoxStack::push);

        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()) {
            int firstBoxItem = firstBoxQueue.peek();
            int secondBoxItem = secondBoxStack.peek();

            int sum = firstBoxItem + secondBoxItem;
            if (sum % 2 == 0) {
                firstBoxQueue.poll();
                secondBoxStack.pop();
                loot += sum;
            } else {
                secondBoxStack.pop();
                firstBoxQueue.offer(secondBoxItem);
            }
        }
        if (firstBoxQueue.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if (loot >= 100) {
            System.out.printf("Your loot was epic! Value: %d", loot);
        } else {
            System.out.printf("Your loot was poor... Value: %d", loot);
        }
    }
}
