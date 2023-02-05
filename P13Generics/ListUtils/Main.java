package P13Generics.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(2);
        ints.add(1);
        ints.add(88);
        System.out.println(ListUtils.getMax(ints));
    }
}
