package CodeWars_6Kyu.deadfish_swim;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Write a simple parser that will parse and run Deadfish.

 * Deadfish has 4 commands, each 1 character long:

 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array

 * Invalid characters should be ignored.

 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 * @see <a href="https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java">Codewars Kata</a>
 */
public class DeadFish {
    public static int[] parse(String commands) {
        String[] splitCommands = commands.split("");
        List<Integer> parsedCommands = new ArrayList<>();
        int value = 0;

        for (int i = 0; i < splitCommands.length; i++) {
            String command = splitCommands[i];
            switch (command) {
                case "i" -> value++;
                case "d" -> value--;
                case "s" -> value *= value;
                case "o" -> parsedCommands.add(value);
            }
        }

        // convert List back to int[]
        int[] wrapperArr = parsedCommands.stream().mapToInt(i -> i).toArray();
        return wrapperArr;
    }
}
