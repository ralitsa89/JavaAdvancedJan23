package P14ExerciseGenerics.P06GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(value.getClass().getName()).append(": ").append(value).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(values, firstIndex, secondIndex);
    }

    public long countGreaterItems(T element) {
        return values.stream().filter(itemFromOurBox -> itemFromOurBox.compareTo(element) > 0).count();
    }
}
