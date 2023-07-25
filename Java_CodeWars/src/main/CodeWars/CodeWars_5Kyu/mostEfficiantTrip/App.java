package CodeWars_5Kyu.mostEfficiantTrip;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<Integer> distances01 = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58, 60));
        int distance01 = MostEfficiantTrip.chooseBestSum(163, 3, distances01);
        System.out.println(163 == distance01);

        //List<Integer> distances02 = new ArrayList<>(Arrays.asList(50));
        //int distance02 = MostEfficiantTrip.chooseBestSum(163, 3, distances02);
        // System.out.println(distance02 != null);

        // List<Integer> distances03 = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        // int distance03 = MostEfficiantTrip.chooseBestSum(230, 3, distances03);
        // System.out.println(228 == distance03);
    }
}
