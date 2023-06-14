package DynamicBinding;

public class Device {
    String name;
    boolean powerOn;

    // Constructors
    Device(String name, boolean powerOn) {
        this.name = name;
        this.powerOn = powerOn;
    }

    // static Methods
    public static void printTest() {
        System.out.println("In Device.class");
    }

    // Getters / Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean getPowerOn() {
        return this.powerOn;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", powerOn=" + powerOn +
                '}';
    }
}
