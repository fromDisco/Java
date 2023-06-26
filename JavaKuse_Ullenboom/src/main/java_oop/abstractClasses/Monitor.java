package abstractClasses;

public class Monitor extends Device {
    int inchSize;

    // Constructors
    Monitor(String name, boolean powerOn) {
        super(name, powerOn);
    }

    // abstract methods
    @Override
    public Type getType() {
        return Type.MONITOR;
    }

    // Getters / Setters
    public void setInchSize(int inchSize) {
        this.inchSize = inchSize ;
    }

    public int getInchSize() {
        return this.inchSize;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                super.toString() +
                ", size=" + inchSize + " inch" +
                "}";
    }
}
