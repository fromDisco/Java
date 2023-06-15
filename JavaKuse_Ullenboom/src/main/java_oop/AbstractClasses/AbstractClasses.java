package AbstractClasses;

public class AbstractClasses {
    public static void main(String[] args) {
        GamingPC gamingPC01 = new GamingPC("Volksporsche", true, "NVIDIA", "AMD");
        SBC sbc01 = new SBC("Panda", true, 32);

        Device.listTypes(sbc01, gamingPC01);
    }
}
