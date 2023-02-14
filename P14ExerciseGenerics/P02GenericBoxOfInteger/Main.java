package P14ExerciseGenerics.P02GenericBoxOfInteger;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();

        for (int i = 0; i < n; i++) {
           Integer element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }
        System.out.println(box);
    }
}
