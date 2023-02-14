package P14ExerciseGenerics.P01GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<S> {
    private List<String> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(String element){
        values.add(element);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            sb.append(value.getClass().getName()).append(": ").append(value).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
