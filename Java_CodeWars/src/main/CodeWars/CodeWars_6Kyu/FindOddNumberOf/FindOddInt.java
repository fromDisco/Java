package CodeWars_6Kyu.FindOddNumberOf;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, find the one that appears an odd number of times.

 * There will always be only one integer that appears an odd number of times.
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 * @see <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java">Codewars Kata</a>

 */
public class FindOddInt {
    public static int findIt(int[] array) {
        // using ^ (XOR) to reduce array: 2 ^ 2 == 0. so 2 ^ 2 ^ 2  == 2;
        // the odd number will remain after all even numbers are reduced
        // https://www.baeldung.com/java-bitwise-operators
        int result = Arrays.stream(array).reduce(0, (sum, element) -> sum ^ element);
        return result;
    }
}
