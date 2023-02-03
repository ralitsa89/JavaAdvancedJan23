package P12ExerciseDefiningClasses.P07Google;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon>pokemons;

    public Person(){
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Person(Company company, Car car, List<Parent> parents, List<Child> children, List<Pokemon> pokemons) {
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemons = pokemons;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company:").append(System.lineSeparator());
        if (company != null){
            sb.append(company).append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (car != null){
            sb.append(car).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemon pokemon : pokemons) {
        sb.append(pokemon).append(System.lineSeparator());
            }
        sb.append("Parents:").append(System.lineSeparator());
        for (Parent parent : parents) {
            sb.append(parent).append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Child child : children) {
            sb.append(child).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
