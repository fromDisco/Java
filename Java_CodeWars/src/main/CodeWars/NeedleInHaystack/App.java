package NeedleInHaystack;

import java.util.Arrays;

/**
 * Can you find the needle in the haystack?
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 * After your function finds the needle it should return a message (as a string) that says:
 * "found the needle at position " plus the index it found the needle, so:
 * Example Output:
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
 * {@see https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java}
 */
public class App {
    public static String findNeedle(Object[] haystack) {
        int len = haystack.length;
        int position = -1;
        for (int i = 0; i < len; i++) {
            if ((haystack[i] != null) && (haystack[i].equals("needle"))) {
                position = i;
                break;
            }
        }
        return "found the needle at position " + position;
    }

    /**
     * @see https://www.codewars.com/kata/reviews/5682e623c0c0e6b61d000004/groups/568ebc95c1f61959ab000037
     * @param haystack
     * @return String result
     */
    public static String findNeedleCodeWarsSolution(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
