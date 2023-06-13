package Constructors;

import java.awt.*;

public class Radio {
    private boolean isOn;
    private String name = "unknown";
    private double frequency;
    private String version;

    // ##################################################
    // initilizer Block gets called for every constructor
    // https://www.baeldung.com/java-static-instance-initializer-blocks
    {
        this.version = "Version 1.0";
    }
    // ##################################################

    // CONSTRUCTORS
    public Radio() {
        this.setIsOn(true);
    }

    public Radio(double frequency) {
        this.setIsOn(true);
        this.setFrequency(frequency);
    }

    // Copy Constructors
    /**
     * @see <a href="https://www.geeksforgeeks.org/copy-constructor-in-java/">https://www.geeksforgeeks.org/copy-constructor-in-java/</a>
     * @param original Instance object of Radio to be copied
     */
    public Radio(Radio original) {
        this.isOn = original.isOn;
        this.name = original.name;
        this.frequency = original.frequency;
    }

    public Radio(RadioStationEnum station) {
        this.setIsOn(true);
        this.setName(station.toString());
        this.setFrequency(station);
    }

    /**
     * calls double Constructor: Radio(double frequency)
     * @param name String
     * @return new Radio instance
     */
    public static Radio ofFrequency(double frequency) {
        Radio instance = new Radio();
        instance.setFrequency(frequency);
        return instance;
    }

    // GETTERS / SETTERS
    public void setIsOn(boolean on) {
        this.isOn = on;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setFrequency(RadioStationEnum station) {
        this.frequency = station.getFrequency();
    }

    public double getFrequency() {
        return this.frequency;
    }

    // toString
    public String toString() {
        return "Radio{" +
                "name = " + this.name + ", " +
                "isOn = " + this.isOn + ", " +
                "frequency = " + this.frequency +
                "version = " + this.version +
                "}";
    }
}
