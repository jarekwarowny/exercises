package device;

import device.Device;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    public Double screenSize;
    public String os;
    private static final String ADDRESS_SERVER = "aaa.com";
    private static final String VERSION_OF_APP = "aaa";


    public Phone(Double screenSize, String os) {
        super("Nokia","aa", 2010);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void installAnnApp(String nameOfApp) {

    }

    public void installAnnApp(String nameOfApp, String version) {

    }

    public void installAnnApp(String nameOfApp, String version, String server) {

    }

    public void installAnnApp(List<String> app) {

    }

    public void installAnnApp(URL url) {

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
