package CodeWars_5Kyu.printDiamond;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Jamie is a programmer, and James' girlfriend.
 * She likes diamonds, and wants a diamond string from James.
 * Since James doesn't know how to make this happen, he needs your help.

 * Task:
 * You need to return a string that looks like a diamond shape when printed on the screen,
 * using asterisk (*) characters. Trailing spaces should be removed,
 * and every line must be terminated with a newline character (\n).

 * Return null/nil/None/... if the input is an even number or negative,
 * as it is not possible to print a diamond of even or negative size.

 * Examples:
 * A size 3 diamond:
 * <p>
 * <p>  *  </p>*
 * <p>***</p>*
 * <p>  *  </p>*
 * </p>
 * ...which would appear as a string of " *\n***\n *\n"

 * A size 5 diamond:
 * <p>
 * <p>&nbsp &nbsp * &nbsp &nbsp</p>*
 * <p>&nbsp *** &nbsp</p>*
 * <p>*****</p>*
 * <p>&nbsp *** &nbsp</p>*
 * <p>&nbsp &nbsp * &nbsp &nbsp</p>*
 * </p>
 * ...that is:
 "  *\n ***\n*****\n ***\n  *\n"
 * @see <a href="https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java">CodeWars Kata</a>
 */
public class PrintDiamond {
    public static String print(int number) {
        if (number < 0 || number % 2 == 0) return null;

        StringBuffer diamond = new StringBuffer();
        int counter = 1;
        boolean backwards = false;

        while (counter > 0) {
            int spacing = (number - counter) / 2;
            diamond.append(" ".repeat(spacing) + "*".repeat(counter) + "\n");

            if (counter == number) backwards = true;
            if (!backwards) counter += 2;
            else counter -= 2;
        }
        return diamond.toString();
    }
}
