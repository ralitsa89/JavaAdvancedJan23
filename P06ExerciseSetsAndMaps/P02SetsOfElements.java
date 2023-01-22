package P06ExerciseSetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        int sizeOfFirstSet = Integer.parseInt(input.split(" ")[0]);
        int sizeOfSecondSet = Integer.parseInt(input.split(" ")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int num = 1; num <= sizeOfFirstSet; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
        }
        for (int num = 1; num <= sizeOfSecondSet; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(element -> System.out.print(element + " "));
    }
}
