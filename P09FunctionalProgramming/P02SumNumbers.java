package P09FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Function<String, Integer> parseInt = s -> Integer.parseInt(s);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> parseInt.apply(elem))
                .collect(Collectors.toList());

        int sum = numbers
                .stream()
                .mapToInt(e -> e)    //identity function
                .sum();

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);

    }
}
