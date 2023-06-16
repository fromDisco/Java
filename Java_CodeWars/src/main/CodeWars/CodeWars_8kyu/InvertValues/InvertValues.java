package CodeWars_8kyu.InvertValues;

import java.util.Arrays;
import java.util.List;

/**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            array[i] = -array[i];
        }
        return array;
    }
    public static int[] invertCodeWarsSolution(int[] array) {
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }
}
