package dynamicBinding;

public class DynamicBinding {
    public static void main(String[] args) {
        GamingPC gamingPC01 = new GamingPC("Volksporsche", true, "AMD", "NVDIA");
        Device gamingPC02 = new GamingPC("Taschenrakete", true, "Intel", "Intel");

        // Runtime looks for the actual object and executes the .toString of GamingPc.class, not Device.class
        System.out.println("GamingPC object .toString() -> " + gamingPC01.toString());
        System.out.println("Device object .toString() -> " + gamingPC02.toString());

        gamingPC01.printTest();
        gamingPC02.printTest();
    }

}
