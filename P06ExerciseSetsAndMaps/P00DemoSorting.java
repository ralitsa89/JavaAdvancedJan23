package P06ExerciseSetsAndMaps;

import java.util.*;

import static java.lang.System.in;
import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class P00DemoSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, List<Double>> map = new HashMap<>();

        //СОРТИРАНЕ ПО СТОЙНОСТ
        // ascending order ->
        map.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue().size() - s1.getValue().size());


        //descending order ->
        map.entrySet().stream()
                .sorted((s1, s2) -> s1.getValue().size() - s2.getValue().size());


        //СОРТИРАНЕ ПО КЛЮЧ
        // ascending order ->
        map.entrySet().stream().sorted(comparingByKey());

        //descending order ->
        map.entrySet().stream().sorted(Collections.reverseOrder(comparingByKey()));

        //СОРТИРАНЕ ПО СТОЙНОСТ
        // ascending order ->
        // map.entrySet().stream().sorted(comparingByValue());

        // ascending order ->
        //map.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()));


        //съхраняваме в нов мап вече сортирания мап
//        Map<String, Integer> sortMap = map.entrySet().stream()
//                .sorted(comparingByKey())
//                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashSet::new));

        //съхраняваме в същия мап вече сортирания мап
//        map = map.entrySet().stream()
//                .sorted(comparingByKey())
//                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashSet::new));

    }
}
