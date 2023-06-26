package implicitExplicitType;

public class Computer extends Device {
    String cpu;
    String gpu;

    // Constructors
    Computer(String name, String type, int watt, String cpu, String gpu) {
        super(name, type, watt);
        this.cpu = cpu;
        this.gpu = gpu;
    }

    // Setters / Getters
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return this.cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String toString() {
        return "Computer{" +
                "name=" + this.name +
                ", type=" + this.type +
                ", cpu=" + this.cpu +
                ", gpu=" + this.gpu +
                "}";
    }
}
