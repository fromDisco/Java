package Inheritance;

public class Parent {
    protected String name;
    protected boolean isOn;

    // Constructors
    /**
     * @param name String, name of device
     * @param isOn boolean, is device powered or not
     */
    Parent(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    // Setter / Getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public String toString() {
        return "Parent{" +
                "name=" + this.name +
                ", isOn=" + this.isOn +
                "}";
    }
}
