package abstractClasses;

public abstract class Device {
    String name;
    boolean powerOn;
    int price;
    enum Type {
        SBC, PC, MONITOR, MICRO_CONTROLLER
    }

    // Constructors
    Device(String name, boolean powerOn) {
        this.name = name;
        this.powerOn = powerOn;
    }

    // Abstract methods
    abstract Type getType();

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

    // other methods
    // POLYMORPHY
    // use implementations of abstract methods
    // .getType() has different implementations
    public static void listTypes(Device... devices) {
        for (Device device : devices) {
            System.out.println(device.getType().toString());
        }
    }


    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", powerOn=" + powerOn +
                '}';
    }
}
