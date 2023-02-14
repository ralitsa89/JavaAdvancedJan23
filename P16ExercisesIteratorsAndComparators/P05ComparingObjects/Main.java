package P16ExercisesIteratorsAndComparators.P05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();
        while (!input.equals("END")) {
            String[] peopleData = input.split(" ");
            String name = peopleData[0];
            int age = Integer.parseInt(peopleData[1]);
            String town = peopleData[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scanner.nextLine();
        }

        int comparePersonIndex = Integer.parseInt(scanner.nextLine());
        Person personToCompare = people.get(comparePersonIndex - 1);

        int totalPeople = people.size();
        int samePeople = 0;
        int diffPeople = 0;

        for (Person person : people) {
            if (person.compareTo(personToCompare) == 0) {
                samePeople++;
            } else {
                diffPeople++;
            }
        }
        if (samePeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", samePeople, diffPeople, totalPeople);
        }
    }
}
