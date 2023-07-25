package Codewars_7kyu.next_perfect_square.CountPeopleOnBus;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Call:");
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(5 == CountPeopleOnBus.countPassengers(list));

    }
}
