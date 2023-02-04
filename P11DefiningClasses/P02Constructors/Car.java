package P11DefiningClasses.P02Constructors;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int horsePower;
    private List<String>parts;

    public Car(){
        this.parts = new ArrayList<>();
    }

    public Car(String brand, String model, int horsePower) {
        this();
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car(String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }
}
