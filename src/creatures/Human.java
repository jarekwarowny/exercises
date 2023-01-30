package creatures;

import device.Car;
import device.Phone;

public class Human extends Animal {

    String firstName;
    String lastName;
    public Car[] garage;
    Double salary;
    Phone phone;
    Animal pet;
    public Double cash;

    public Human(String firstName) {
        super("homo");
        this.salary = 0.0;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Car[] getGarage() {
        return garage;
    }

    public Double getSalary() {
        return salary;
    }

    public Phone getPhone() {
        return phone;
    }

    public Animal getPet() {
        return pet;
    }

    public Double getCash() {
        return cash;
    }

    public void setCar(Car car1, Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.toString().length()) {
            System.out.println("Garaz jest za mały");
        } else if (parkingLotNumber < 0) {
            System.out.println("Nie mozna zaparkowac");
        } else if (this.garage[parkingLotNumber] != null) {
            System.out.println("Miejsce zajete");
        } else {
            this.garage[parkingLotNumber] = car1;
        }
    }

    @Override
    public void feed(double foodWeight) {

    }
}
