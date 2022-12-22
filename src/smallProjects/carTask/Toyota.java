package smallProjects.carTask;

import java.time.LocalDate;

public class Toyota extends Car{
    public Toyota(String make, String model, LocalDate year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    void start() {
        System.out.println(getMake() + " " + getModel() + "Twist the key to ignition to start. ");
    }

    @Override
    void drive() {
        System.out.println(getModel() + " " + getMake() + " Special driving experience :P " );
    }
}
