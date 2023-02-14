package P20ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P1001OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);

        ArrayDeque<Integer> threads = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(threads::offer);

        int endTask = Integer.parseInt(scanner.nextLine());

        int task = tasks.peek();
        int thread = threads.peek();

        while (task != endTask) {

            if (thread >= task) {
                tasks.pop();
            }
            threads.poll();

            task = tasks.peek();
            thread = threads.peek();
        }
        System.out.printf("Thread with value %d killed task %d%n", threads.peek(), endTask);
        String leftThreads = threads.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(leftThreads);
    }
}
