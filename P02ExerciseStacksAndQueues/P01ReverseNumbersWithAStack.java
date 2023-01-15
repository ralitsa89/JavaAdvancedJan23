package P02ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<String> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(numbers::push);

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
