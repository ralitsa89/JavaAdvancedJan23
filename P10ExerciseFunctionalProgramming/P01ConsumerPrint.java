package P10ExerciseFunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

import static java.lang.System.in;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String> printName = name -> System.out.println(name);
        for (String name : names) {
            printName.accept(name);
        }
    }
}
