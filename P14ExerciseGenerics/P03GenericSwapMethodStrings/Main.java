package P14ExerciseGenerics.P03GenericSwapMethodStrings;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            box.add(element);
        }

        String[] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);
        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
