package P20ExamPreparation.P1403VetClinic;

import java.util.*;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(p -> p.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return data.stream()
                .filter(p -> p.getName().equals(name) && p.getOwner().equals(owner))
                .findAny()
                .orElse(null);
    }

    public Pet getOldestPet() {
        return Collections.max(data, Comparator.comparingInt(Pet::getAge));
    }
    public int getCount(){
        return  data.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder("The clinic has the following patients:");
        for (Pet p : data) {
            sb.append(System.lineSeparator());
            sb.append(p.getName())
                    .append(" ")
                    .append(p.getOwner());
        }
        return sb.toString();
    }
}
