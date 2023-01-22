package P06ExerciseSetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P06FixEmails01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();

        Map<String, String> emailsData = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if (!email.endsWith("uk") && !email.endsWith("us")&& !email.endsWith("com")){
                emailsData.put(name, email);
            }
            name = scanner.nextLine();
        }
        emailsData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
