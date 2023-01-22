package P06ExerciseSetsAndMaps;

import java.util.*;

import static java.lang.System.in;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueElements = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            uniqueElements.addAll(Arrays.asList(elements));
        }
        uniqueElements.forEach(element -> System.out.print(element + " "));
    }
}
