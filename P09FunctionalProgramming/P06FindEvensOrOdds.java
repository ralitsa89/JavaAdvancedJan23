package P09FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.lang.System.in;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        Predicate<Integer> filterCondition =
                oddOrEven.equals("odd") ? (x -> x % 2 != 0) : (x -> x % 2 == 0);   //Тернарен оператор: условие -> true case - false case

        IntStream.rangeClosed(lowerBound, upperBound )
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));
    }
}
