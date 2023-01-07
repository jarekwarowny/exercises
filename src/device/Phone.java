package device;

import device.Device;

public class Phone extends Device {

    public Double screenSize;

    public String os;

    public Phone(Double screenSize, String os) {
        super("Nokia","aa", 2010);
        this.screenSize = screenSize;
        this.os = os;
    }

    @Override
    public String toString() {
        return "device.Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
      System.out.println("click");
      System.out.println("wait");
      System.out.println("ready");
    }
}
