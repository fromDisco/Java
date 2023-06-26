package dynamicBinding;

public class GamingPC extends Device {
    String gpu;
    String cpu;

    // Constructors
    GamingPC(String name, boolean powerOn, String gpu, String cpu) {
        super(name, powerOn);
        this.gpu = gpu;
        this.cpu = cpu;
    }

    // static Methods
    public static void printTest() {
        System.out.println("In GamingPC.class");
    }

    // Getters / Setters
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "GamingPC{" +
                 super.toString() +
                ", gpu='" + gpu + '\'' +
                ", cpu='" + cpu + '\'' +
                "}";
    }
}
