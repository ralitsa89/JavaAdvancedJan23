package P14ExerciseGenerics.P06GenericCountMethodDoubles;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();

        for (int i = 0; i < n; i++) {
            Double element = Double.parseDouble(scanner.nextLine());
            box.add(element);
        }
        Double elementToCompare =Double.parseDouble(scanner.nextLine());
        System.out.println(box.countGreaterItems(elementToCompare));

    }
}
