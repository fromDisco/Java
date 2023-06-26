package implicitExplicitType;

public class Radio extends Device {
    int numberOfStations;

    Radio(String name, String type, int watt, int stations) {
        super(name, type, watt);
        this.numberOfStations = stations;
    }

    // Setters / Getters
    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return this.numberOfStations;
    }

    public String toString() {
        return "Radio{" +
                "name=" + this.name +
                ", type=" + this.type +
                ", stations=" + this.numberOfStations +
                "}";
    }
}
