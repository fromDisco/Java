package CodeWars_6Kyu.tenMinuteWalk;

/**
 * You live in the city of Cartesia where all roads are laid out in a perfect grid.
 * You arrived ten minutes too early to an appointment,
 * so you decided to take the opportunity to go for a short walk.
 * The city provides its citizens with a Walk Generating App on their phones
 * -- everytime you press the button it sends you an array of one-letter strings
 * representing directions to walk (eg. ['n', 's', 'w', 'e']).
 * You always walk only a single block for each letter (direction) and you know
 * it takes you one minute to traverse one city block, so create a function that will return true
 * if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will,
 * of course, return you to your starting point. Return false otherwise.
 * Note: you will always receive a valid array containing a random assortment of direction letters
 * ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).

 * @see <a href="https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java">CodeWars Kata</a>
 */
public class IsItTenMinutesLong {

    public static boolean isValid(char[] walk) {
        // if way is longer than 10: return false
        int length = walk.length;
        if (length != 10) {
            return false;
        }

        // for every direction the is a counter direction
        // direction + counter direction == 0;
        // if way == 0, route returns to starting point
        int way = 0;
        for (int i = 0; i < length; i++) {
            if (walk[i] == 'n') way -= 1;
            else if (walk[i] == 's') way += 1;
            // choose number much different from 1 and -1 because otherwise:
            // if 'e' == 2 nad 'w' == -2
            // two 'n' would eqaul 'e' == 2
            else if (walk[i] == 'e') way -= 100;
            else if (walk[i] == 'w') way += 100;
        }
        return way == 0;
    }
}
