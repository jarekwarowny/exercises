import device.Device;

public class Car extends Device {

    Double millage;

    String color;

    String fuelType;

    public Car(Double millage, String color, String fuelType) {
        super("X5", "BMW", 2021);
        this.millage = millage;
        this.color = color;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
