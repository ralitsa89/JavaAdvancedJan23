package P20ExamPreparation;

import java.util.*;

import static java.lang.System.in;

public class P0101ClimbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        ArrayDeque<Integer> portions = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(portions::push);

        ArrayDeque<Integer> stamina = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(stamina::offer);

        Map<String, Integer> peaks = new LinkedHashMap<>();

        int days = 0;
        int count = 0;
        while (!portions.isEmpty() && !stamina.isEmpty()) {
            int first = portions.peek();
            int second = stamina.peek();

            int sum = first + second;

            if (sum >= 80 && peaks.isEmpty()) {
                portions.pop();
                stamina.poll();
                peaks.put("Vihren", 0);
            }else if (sum >= 90 && peaks.size() == 1) {
                portions.pop();
                stamina.poll();
                peaks.put("Kutelo", 0);
            }else if (sum >= 100 && peaks.size() == 2) {
                portions.pop();
                stamina.poll();
                peaks.put("Banski Suhodol", 0);
            }else if (sum >= 60 && peaks.size() == 3) {
                portions.pop();
                stamina.poll();
                peaks.put("Polezhan", 0);
            }else if (sum >= 70 && peaks.size() == 4 ) {
                portions.pop();
                stamina.poll();
                peaks.put("Kamenitza", 0);
            }else if (days == 7 || peaks.size() == 5) {
                break;
            } else {
                portions.pop();
                stamina.poll();
            }
            days++;
        }
        if (peaks.size() == 5) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
            System.out.println("Conquered peaks:");
            if (peaks.size() > 0) {
                for (String peak : peaks.keySet()) {
                    System.out.println(peak);
                }
            }
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }

    }
}
