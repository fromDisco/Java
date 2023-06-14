package OverrideMethods;

public class Device {
    protected boolean isOn;
    protected String name;

    // Constructors
    Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    Device(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    // Setters / Getters
    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean getOn() {
        return this.isOn;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "isOn=" + isOn +
                ", name='" + name + '\'' +
                '}';
    }
}
