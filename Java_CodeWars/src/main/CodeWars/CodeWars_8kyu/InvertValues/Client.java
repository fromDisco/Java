package CodeWars_8kyu.InvertValues;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] input01 = new int[] {-1,-2,-3,-4,-5};
        String result01 = Arrays.toString(InvertValues.invert(input01));
        String expected01 = "[1, 2, 3, 4, 5]";
        System.out.println(expected01.equals(result01));

        int[] input02 = new int[] {-1,2,-3,4,-5};
        String result02 = Arrays.toString(InvertValues.invert(input02));
        String expected02 = Arrays.toString(new int[] {1,-2,3,-4,5});
        System.out.println(expected02.equals(result02));

        int[] input03 = new int[] {};
        String result03 = Arrays.toString(InvertValues.invert(input03));
        String expected03 = Arrays.toString(new int[] {});
        System.out.println(expected03.equals(result03));

        int[] input04 = new int[] {0};
        String result04 = Arrays.toString(InvertValues.invert(input04));
        String expected04 = Arrays.toString(new int[] {0});
        System.out.println(expected04.equals(result04));
    }
}
