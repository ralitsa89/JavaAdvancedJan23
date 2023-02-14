package P16ExercisesIteratorsAndComparators.P04Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        List<Integer> numbersList = Arrays.stream(input.split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        Lake lake = new Lake(numbersList);

        List<String> result = new ArrayList<>();
        for (Integer integer : lake) {
           result.add(integer + "");
        }
        System.out.println(String.join(", ", result));
    }
}
