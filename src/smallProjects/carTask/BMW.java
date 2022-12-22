package smallProjects.carTask;

import java.time.LocalDate;

public class BMW extends Car{
    public BMW(String make, String model, LocalDate year, String color, double price) {
        super(make, model, year, color, price);
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
