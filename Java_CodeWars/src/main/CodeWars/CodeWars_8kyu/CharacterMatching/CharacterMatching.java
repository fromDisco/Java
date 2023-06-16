package CodeWars_8kyu.CharacterMatching;

/**
 * @see <a href="https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java">CodeWars kata link -></a>
 * <p>
 * Create a function which answers the question "Are you playing banjo?".
 *
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 * The function takes a name as its only argument, and returns one of the following strings:
 * name + " plays banjo"
 * name + " does not play banjo"
 */
public class CharacterMatching {
    public static String areYouPlayingBanjo(String name) {
        String[] textOptions = {" plays banjo", " does not play banjo"};
        return name + (name.toLowerCase().charAt(0) == 'r' ? textOptions[0] : textOptions[1]);
    }
}
