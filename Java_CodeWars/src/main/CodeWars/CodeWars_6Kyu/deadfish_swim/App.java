package CodeWars_6Kyu.deadfish_swim;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{8, 64}, DeadFish.parse("iiisdoso")));
        System.out.println(Arrays.equals(new int[]{8, 64, 3600}, DeadFish.parse("iiisdosodddddiso")));
    }
}
