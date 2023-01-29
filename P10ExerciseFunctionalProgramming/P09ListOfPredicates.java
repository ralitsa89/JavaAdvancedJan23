package P10ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, list) -> {
            for (int numIntList : list) {
                if (number % numIntList != 0) {
                    return false;
                }
            }
            return true;
        });
        for (int number = 1; number <= n; number++) {
            if (isDivisible.apply(number, numbers)){
                System.out.print(number + " ");
            }
        }
    }
}
