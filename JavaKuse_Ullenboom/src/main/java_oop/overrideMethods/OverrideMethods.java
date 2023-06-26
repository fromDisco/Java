package overrideMethods;

public class OverrideMethods {
    public static void main(String[] args) {
        FireAlarm fireAlarm01 = new FireAlarm("Crisu", "uiiiiiii");
        System.out.println("fireAlarm01 -> " + fireAlarm01);
        System.out.println("fireAlarm01.getOn() -> " + fireAlarm01.getOn());
        fireAlarm01.setOn(false);
        System.out.println("fireAlarm01.getOn() after .setOn(False) -> " + fireAlarm01.getOn());
    }
}

