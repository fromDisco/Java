package EnumCounters;


public class EnumCounters {
    public static void main(String[] args) {
        Country france = Country.FRANCE;
        System.out.println("france.name(): " + france.name());
        System.out.println("france.ordinal(): " + france.ordinal());
        System.out.println("france.describeConstable(): " + france.describeConstable());
        System.out.println("france.hashCode(): " + france.hashCode());
        System.out.println("france.getComment(): " + france.getComment());
        System.out.println("france.isMonarchy(): " + france.isMonarchy());
        System.out.println("france.isBeautiful(): " + france.isBeautiful());

        Country belgium = Country.BELGIUM;
        System.out.println("\nbelgium.isBeautiful(): " + belgium.isBeautiful());

        System.out.println("\nCountry.values():");
        for (Country value : Country.values()) {
            System.out.println(value);
        }

    }

}
