package Constructors;

public enum RadioStationEnum {
    RADIO_ELECTRO(99.9),
    RADIO_MODERN(88.8);

    private final double FREQUENCY;

    RadioStationEnum(double frequency) {
        this.FREQUENCY = frequency;
    }

    public double getFrequency() {
        return this.FREQUENCY;
    }
}
