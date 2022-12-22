package smallProjects.carTask;

import java.time.LocalDate;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, LocalDate year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park feature.");
    }

    @Override
    void start() {
        System.out.println(getModel() + " " + getMake() + "Twist the key to ignition to start. " );
    }

    @Override
    void drive() {
        System.out.println(getModel() + " " + getMake() + " Special driving experience :P " );
    }
}
