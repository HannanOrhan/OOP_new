package smallProjects.carTask;

import java.time.LocalDate;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{
    public CydeoCar(String make, String model, LocalDate year, String color, double price) {
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
        System.out.println(getModel() + " " + getMake() + " has own special start function." );
    }

    @Override
    void drive() {
        System.out.println(getModel() + " " + getMake() + " Special driving experience :P " );
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " has fly function.");
    }
}
