package P11DefiningClasses.P01CarInfo;

import P11DefiningClasses.P01CarInfo.Car;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carParts = scanner.nextLine().split(" ");
            Car car = new Car();
            car.setBrand(carParts[0]);
            car.setModel(carParts[1]);
            car.setHorsePower(Integer.parseInt(carParts[2]));

            System.out.println(car.carInfo());
        }
    }
}
