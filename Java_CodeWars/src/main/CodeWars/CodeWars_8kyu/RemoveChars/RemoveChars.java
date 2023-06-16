package CodeWars_8kyu.RemoveChars;

/**
 * @see <a href="https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java">CodeWars kata link -></a>
 * <p>
 * Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 */
public class RemoveChars {
    static String removeExclamationMarks(String cleanMe) {
        return cleanMe.replaceAll("!", "");
    }
}
