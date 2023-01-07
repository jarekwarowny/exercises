package device;

import creatures.Human;
import creatures.Saleable;

public class Car extends Device implements Saleable {

    public Double millage;

    public String color;

    public String fuelType;

    public Car(Double millage, String color, String fuelType) {
        super("X5", "BMW", 2021);
        this.millage = millage;
        this.color = color;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "device.Car{" +
                "millage=" + millage +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Start engine");
        System.out.println("Press gas");
        System.out.println("Go");
    }

    @Override
    public void Sell(Human seller, Human buyer, Human price) {
        if (buyer.cash >= price.cash) {
            System.out.println("Auto zostało sprzedana");
        } else {
            System.out.println("Nie możesz kupić auta za malo pieniedzy");
        }
        if (seller.car == this) {

        }
    }
}
