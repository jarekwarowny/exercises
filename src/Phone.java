import device.Device;

public class Phone extends Device {

    Double screenSize;

    String os;

    public Phone(Double screenSize, String os) {
        super("Stinger","Kia", 2018);
        this.screenSize = screenSize;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }
}
