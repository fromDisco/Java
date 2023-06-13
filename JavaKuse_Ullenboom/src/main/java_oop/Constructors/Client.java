package Constructors;

import java.time.LocalDate;
import java.util.Locale;

public class Client {
    public static void main(String[] args) {
        Radio radio0 = new Radio();
        System.out.println(radio0);

        // instantiate with double frequency
        Radio radio1 = new Radio(100.4);
        System.out.println(radio1);

        // instantiate with Enumaration RadioStationEnum
        Radio radio2 = new Radio(RadioStationEnum.RADIO_MODERN);
        System.out.println(radio2);

        // instantiate with Enumaration RadioStationEnum
        Radio radio2Copy = new Radio(radio2);
        System.out.println(radio2Copy);
        // compare objects
        System.out.println("Original and Copy are different. \"(radio2 == radio2Copy)\" -> " + (radio2 == radio2Copy));

        // Factory methods
        Radio radioFactory = Radio.ofFrequency(88.9);
        System.out.println("# This is an instance created by an factory method: \n" + radioFactory);
        // Example of Class, that can only be instantiated by factory method
        LocalDate date = LocalDate.of(2023, 06, 12);
        LocalDate now = LocalDate.now();
        System.out.println("LocalDate date: " + date);
        System.out.println("LocalDate now: " + now);

    }
}
