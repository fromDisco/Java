package Radio;

public class App {

    public static void main(String[] args) {
        Radio radio01 = new Radio();
        radio01.setName("My nostalgic weakness");
        radio01.setFrequency(88.8);
        radio01.isOn = true;
        // turn up the volume
        radio01.volumeUp();
        System.out.println(radio01.toString());

        Radio radio02 = new Radio();
        radio02.setName("My shine geek thingy");
        System.out.println(radio02.toString());

        System.out.println(Radio.stationNameToFrequency("oldies"));
    }
}
