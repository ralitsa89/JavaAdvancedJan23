package P06ExerciseSetsAndMaps;

import javax.swing.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, 0);
            }
            map.put(current, map.get(current) + 1);
        }
        map.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));
    }
}
