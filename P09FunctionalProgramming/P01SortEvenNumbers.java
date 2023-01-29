package P09FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(num -> num % 2 != 0);

        printWithSeparators(numbers);

        System.out.println();
        List<Integer> sortedNumbers = numbers
                .stream()
                .sorted()
                .collect(Collectors.toList());

        printWithSeparators(sortedNumbers);
    }

    private static void printWithSeparators(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
