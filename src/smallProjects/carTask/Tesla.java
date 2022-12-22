package smallProjects.carTask;

import java.time.LocalDate;

public class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla(String make, String model, LocalDate year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park feature.");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has auto pilot feature.");
    }

    @Override
    void start() {
        System.out.println("Use voice control to start " + getModel() + " " + getMake());
    }

    @Override
    void drive() {

    }
}
