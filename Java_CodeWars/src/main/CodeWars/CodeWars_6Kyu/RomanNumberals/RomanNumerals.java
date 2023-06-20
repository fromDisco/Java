package CodeWars_6Kyu.RomanNumberals;

import java.sql.Array;
import java.util.*;

/**
 * Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.
 *
 * Modern Roman numerals are written by expressing each digit separately starting
 * with the left most digit and skipping any digit with a value of zero.
 * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
 * 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 * ---------------
 * Symbol    Value
 * I          1
 * V          5
 * X          10
 * L          50
 * C          100
 * D          500
 * M          1,000
 * ---------------
 * @param number to convert
 * @return string Roman numeral
 * @see <a href="https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java">https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java</a>
 */
public class RomanNumerals {
    public static String solution(int number) {
        // SortedMap<Integer, String> romans = new TreeMap<>();
        LinkedHashMap<Integer, String> romans = new LinkedHashMap<>();
        romans.put(1, "I");
        romans.put(5, "V");
        romans.put(10, "X");
        romans.put(50, "V");
        romans.put(100, "C");
        romans.put(500, "D");
        romans.put(1000, "M");

        String romanNumber = "";
        String numberAsString = Integer.toString(number);
        int index = 0;

        // for (int i = 0; i < numberAsString.length(); i++) {
        for (int key : romans.keySet()) {
            // System.out.println(key);
            String resultString = Character.toString(numberAsString.charAt(index));
            int result = Integer.parseInt(resultString);
            index++;

            if (result < 4) {
                romanNumber += romans.get(key).repeat(result);
            } else if (result == 4) {
                // was previous number also 4?
                romanNumber += "IV" + romans.get(key);
            } else if (result == 5) {
                romanNumber += "V" + romans.get(key);
            } else if (result > 5 && result < 9) {
                romanNumber += "V" + ("I".repeat(5 - result)) + romans.get(key);
            } else if (result == 9) {
                romanNumber += "IV" + romans.get(key);
            }
        }
        return romanNumber;
    }
}
