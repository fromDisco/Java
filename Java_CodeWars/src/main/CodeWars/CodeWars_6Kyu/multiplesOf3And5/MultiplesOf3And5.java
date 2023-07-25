package CodeWars_6Kyu.multiplesOf3And5;

import java.util.List;
import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Finish the solution so that it returns the sum of all the multiples of
 * 3 or 5 below the number passed in. Additionally, if the number is negative,
 * return 0 (for languages that do have them).
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 * @see <a href="https://www.codewars.com/kata/514b92a657cdc65150000006/train/java">CodeWars Kata</a>
 */
public class MultiplesOf3And5 {
    public int solution(int number) {
        List<Integer> multis = IntStream.range(3, number)
                .boxed()
                .filter(element -> element % 3 == 0 || element % 5 == 0)
                .toList();

        return multis.stream().reduce(0, Integer::sum);
    }

    /**
     * CodeWars Solution
     * @see <a href="https://www.codewars.com/kata/reviews/553a8e47f3cc94c58c000123/groups/553a9f87a1a672cc2c000098">CodeWars Solution</a>
     */
    public int solution2(int n) {
        int a = (int) Math.ceil(n/3d) - 1;
        System.out.println("a: " + n/3d);
        System.out.println("a1: " + n/3);

        int b = (int) Math.ceil(n/5d) - 1;
        int c = (int) Math.ceil(n/15d) - 1;
        return (3 * a * (a+1) + 5 * b * (b+1) - 15 * c * (c + 1)) / 2;
    }}
