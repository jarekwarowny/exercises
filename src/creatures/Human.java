package creatures;

import device.Car;
import device.Phone;

public class Human extends Animal {

    String firstName;
    String lastName;
    public Car car;
    Double salary;
    Phone phone;
    Animal pet;
    public Double cash;

    public Human(String firstName) {
        super("homo");
        this.salary = 0.0;
        this.firstName = firstName;
    }
}
