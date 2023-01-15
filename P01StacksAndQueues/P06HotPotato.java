package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] names = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();

        Collections.addAll(kids, names);

        while (kids.size() > 1){
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }
            String removedChild = kids.poll();
            System.out.println("Removed " + removedChild);
        }
        System.out.println("Last is " + kids.poll());
    }
}
