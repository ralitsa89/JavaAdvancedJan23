package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

import static java.lang.System.in;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] names = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();

        Collections.addAll(kids, names);

        int currentSteps = 1;
        while (kids.size() > 1) {
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }
            if (isPrime(currentSteps)) {
                System.out.println("Prime " + kids.peek());
            } else {
                String removedChild = kids.poll();
                System.out.println("Removed " + removedChild);
            }
            currentSteps++;
        }
        System.out.println("Last is " + kids.poll());
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        }else if(num % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
