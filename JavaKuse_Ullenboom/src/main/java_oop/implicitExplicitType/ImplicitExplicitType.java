package implicitExplicitType;

public class ImplicitExplicitType {
    /**
     * hard coded expression: boolean isInstance = radio instanceof Computer;
     * throws error --> incompatible. But loop over arguments and excecuting
     * the same check works fine and as expected.
     * BETTER FAIL FAST:
     * hard coded expression can never be true, so compiler fails, instead of failing late in runtime
     * @param devices List of radios, computers, ...
     */
    public static void testType(Device... devices) {
        System.out.println("\n# forEach loop over list of devices:");
        for (Device device : devices) {
            if (device instanceof Radio) {
                // argument has to be casted, because type Device
                // doesn't know methods of child classes
                Radio radio = (Radio) device;
                radio.setNumberOfStations(18);
                System.out.println("Radio device: " + radio + ", stations: " + radio.getNumberOfStations());
            // alternative, more compact style: assign new variable in statement and use it on the spot
            } else if (device instanceof Computer computer && computer.getWatt() == 0){
                System.out.println("Computer device: " + computer);
            }
        }
    }

    public static void main(String[] args) {
        Device device = new Device("name", "type", 650);
        System.out.println(device);

        // Reference type = object type
        // radio01 has access to all methods of radio, device, object
        Radio radio01 = new Radio("Boombox", "Radio", 100, 10);
        // radio02 has access to methods of device, object
        Device radio02 = new Radio("TinCan", "Radio", 65, 2);
        // radio03 only has access to methods of object
        Object radio03 = new Radio("NoName", "Radio", 5, 1);

        // Test if object of class x
        if (radio01.getClass() == Radio.class) {
            System.out.println("\n# radio01.getClass() -> " + radio01.getClass());
            System.out.println("radio01 instance of Radio -> " + (radio01 instanceof Radio));
            // compiler error. hardcoded expression: radio01 can never be of type Computer.
            // System.out.println("radio01 instance of Radio -> " + (radio01 instanceof Computer));
            System.out.println("radio01 is of type Radio.");
        }
        if (radio02.getClass() == Radio.class) {
            System.out.println("\n# radio02.getClass() -> " + radio02.getClass());
            System.out.println("radio02 instance of Radio -> " + (radio02 instanceof Radio));
            System.out.println("radio02 is of type Radio.");
        }
        if (radio03.getClass() == Radio.class) {
            System.out.println("\n# radio03.getClass() -> " + radio03.getClass());
            System.out.println("radio03 instance of Radio -> " + (radio03 instanceof Radio));
            System.out.println("radio03 is of type Radio.");
        }

        // radio03 can't be passed as argument
        int sum = Radio.totalWatt(radio01, radio02 /* radio03 is type Object, not Device */);
        System.out.println(sum);

        Computer computer01 = new Computer("Commodore", "PC", 25, "mos 6510", "VIC-II");

        testType(radio01, radio02, computer01);
    }
}
