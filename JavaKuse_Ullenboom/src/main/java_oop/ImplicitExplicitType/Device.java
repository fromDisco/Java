package ImplicitExplicitType;

public class Device {
    String name;
    String type;
    int watt;

    // Constructors
    Device(String name, String type, int watt) {
        this.name = name;
        this.type = type;
        this.watt = watt;
    }

    // Setters / Getters
    public void setType(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public int getWatt() {
        return this.watt;
    }

    public static int totalWatt(Device... devices) {
        int sum = 0;
        for (Device device : devices) {
            sum += device.getWatt();
        }
        return sum;
    }

    public String toString() {
        return "Device{" +
                "name=" + this.name +
                ", type=" + this.type +
                "}";
    }
}
