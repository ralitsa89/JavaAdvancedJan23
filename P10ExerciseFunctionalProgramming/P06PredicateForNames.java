package P10ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

import static java.lang.System.in;

public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");
        Predicate<String> checkValidLength = name -> name.length() <= n;

        Arrays.stream(names).filter(checkValidLength)
                .forEach(System.out::println);

    }
}
