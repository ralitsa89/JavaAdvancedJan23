package P12ExerciseDefiningClasses.P03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int countCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 1; i <= countCars; i++) {
            String data = scanner.nextLine();
            String model = data.split(" ")[0];
            double fuelAmount = Double.parseDouble(data.split(" ")[1]);
            double priceFuelPerKm = Double.parseDouble(data.split(" ")[2]);

            Car car = new Car(model, fuelAmount, priceFuelPerKm);
            cars.put(model, car);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String carModelToDrive = command.split(" ")[1];
            int kmToDrive = Integer.parseInt(command.split(" ")[2]);

            Car carToDrive = cars.get(carModelToDrive);

            if (!carToDrive.drive(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }
        for (Car car : cars.values()) {
            System.out.print(car.toString());
        }
    }
}
