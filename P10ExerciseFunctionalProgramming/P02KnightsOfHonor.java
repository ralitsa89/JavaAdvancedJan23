package P10ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

import static java.lang.System.in;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String> printName = name -> System.out.println("Sir " + name);
        Arrays.stream(names).forEach(printName);
    }
}
