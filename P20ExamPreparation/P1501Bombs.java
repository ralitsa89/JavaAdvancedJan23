package P20ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P1501Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> effectsQueue = new ArrayDeque<>();
        ArrayDeque<Integer> casingsStack = new ArrayDeque<>();

        String input = scanner.nextLine();
        Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .forEach(effectsQueue::offer);

        input = scanner.nextLine();
        Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .forEach(casingsStack::push);

        Map<String, Integer> bombMap = new TreeMap<>(Map.of("Datura Bombs", 0,
                "Cherry Bombs", 0,
                "Smoke Decoy Bombs", 0));

        boolean isPouchFull = false;
        while (!effectsQueue.isEmpty() && !casingsStack.isEmpty()) {
            int first = effectsQueue.peek();
            int second = casingsStack.peek();

            int sum = first + second;

            if (sum == 40 || sum == 60 || sum == 120) {
                effectsQueue.poll();
                casingsStack.pop();

                switch (sum) {
                    case 40:
                        bombMap.put("Datura Bombs", bombMap.get("Datura Bombs") + 1);
                        break;
                    case 60:
                        bombMap.put("Cherry Bombs", bombMap.get("Cherry Bombs") + 1);
                        break;
                    case 120:
                        bombMap.put("Smoke Decoy Bombs", bombMap.get("Smoke Decoy Bombs") + 1);
                        break;
                }

            } else {
//                int oldNumberS = casingsStack.peek();
//                casingsStack.pop();
//                casingsStack.push(oldNumberS - 5);
                casingsStack.push(casingsStack.pop() - 5);
            }

            if (bombMap.get("Datura Bombs") >= 3 && bombMap.get("Cherry Bombs") >= 3 && bombMap.get("Smoke Decoy Bombs") >= 3) {
                isPouchFull = true;
                break;
            }
        }

        if (isPouchFull) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }


        if (effectsQueue.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            String collect = effectsQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Bomb Effects: " + collect);
        }

        if (casingsStack.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            String collect = casingsStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Bomb Casings: " + collect);
        }

        bombMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}