package Radio;

import java.util.Locale;

public class Radio {
    public static final String STATION_NAME_MODERN = "modernstuff";
    public static final String STATION_NAME_OLD = "oldstuff";
    public static final String STATION_NAME_TECHNO = "electricstuff";
    private String name;
    boolean isOn;
    private double frequency;
    private short volume;

    public static double stationNameToFrequency(String name) {
        switch (name.toLowerCase(Locale.ROOT)) {
            case STATION_NAME_MODERN: return 100.4;
            case STATION_NAME_OLD: return 84.3;
            case STATION_NAME_TECHNO: return 77.7;
            default: return 90.5;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    double getFrequency() {
        return this.frequency;
    }

    public void volumeUp() {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    short getVolume() {
        return this.volume;
    }

    public String toString() {
        return "Radio{" +
                "name='" + this.name + '\'' +
                ", isOn=" + this.isOn +
                ", frequency=" + this.frequency +
                ", volume=" + this.volume +
                '}';
    }
}
