package CodeWars_8kyu.SumOfIntAndString;

import java.util.List;
/**
 * @see <a href="https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java">CodeWars Kata -></a>
 * <p></p>
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 * Assume input will be only of Integer o String type
 * Return your answer as a number.
 */
public class SumOfIntAndString {
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object num : mixed) {
            sum += Integer.parseInt(num.toString());
        }
        return sum;
    }
}
