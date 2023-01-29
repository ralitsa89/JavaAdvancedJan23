package P10ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*Consumer<List<Integer>> printMinNumber = list -> System.out.println(Collections.min(list));
        printMinNumber.accept(numbers);*/

        Function<List<Integer>, Integer> getMinNumber = list -> Collections.min(list);
        int minElement = getMinNumber.apply(numbers);
        System.out.println(minElement);

    }
}
