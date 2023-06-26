package arrayList_Association;

public class Client {
    public static void main(String[] args) {
        ArrayListTryOut parent = new ArrayListTryOut();
        Appliances appliance01 = new Appliances("Radio", false);
        Appliances appliance02 = new Appliances("Computer", true);

        parent.addAppliance(appliance01);
        parent.addAppliance(appliance02);

        System.out.println(parent);
        System.out.println("Number of switched on devices: " + parent.numberOfActiveAppliances());

        appliance01.setIsOn(true);
        System.out.println("Number of switched on devices: " + parent.numberOfActiveAppliances());

        // Bidirectional reference
        System.out.println(appliance01.uniqueId);
        System.out.println(appliance01.uniqueId.appliance);
    }
}
