package P12ExerciseDefiningClasses.P07Google;

public class Parent {
    private String parentName;
    private String parentBirthday;

    public Parent(String name, String parentBirthday) {
        this.parentName = name;
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return parentName + " " + parentBirthday;
    }
}
