package P06ExerciseSetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, String> phoneBook = new HashMap<>();

        String data = scanner.nextLine();
        while (!data.equals("search")) {
            String name = data.split("-")[0];
            String phoneNum = data.split("-")[1];
            phoneBook.put(name, phoneNum);

            data = scanner.nextLine();
        }
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            if (phoneBook.containsKey(name)) {
                System.out.println(name + " -> " + phoneBook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}
