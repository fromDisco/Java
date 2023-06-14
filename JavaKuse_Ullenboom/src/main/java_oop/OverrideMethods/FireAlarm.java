package OverrideMethods;

final
public class FireAlarm extends Device {
    String sound;

    FireAlarm(String name, String sound) {
        super(name, true);
        this.sound = sound;
    }

    @Override
    public void setOn(boolean on) {
        if (!on) {
            System.out.println("you cant switch out this device for security reasons.");
        }
    }

    /*
    // Cant override "final" methods
    @Override
    public void setName(String name) {

    }
     */

    /**
     * Override super method, and extend it
     * by calling to super.toString() and including the return value
     * @return String representation of Firealarm object
     */
    @Override
    public String toString() {
        return "FireAlarm{" +
                super.toString() +
                ", sound='" + sound + '\'' +
                "} " ;
    }
}
