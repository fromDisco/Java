package AbstractClasses;

public class SBC extends Device {
    int gpioPinNumber;

    // Constructors
    SBC(String name, boolean powerOn, int gpioPinNumber) {
        super(name, powerOn);
        this.gpioPinNumber = gpioPinNumber;
    }

    // abstract methods
    @Override
    public Type getType() {
        return Type.SBC;
    }

    // static Methods
    public static void printTest() {
        System.out.println("In SBC.class");
    }

    // Getters / Setters
    public void gpioPinNumber(int GPIO_PIN_NUMBER) {
        this.gpioPinNumber = gpioPinNumber ;
    }

    public int getGpioPinNumber() {
        return this.gpioPinNumber;
    }

    @Override
    public String toString() {
        return "SBC{" +
                super.toString() +
                ", gpioPinNumber=" + gpioPinNumber +
                "}";
    }
}
