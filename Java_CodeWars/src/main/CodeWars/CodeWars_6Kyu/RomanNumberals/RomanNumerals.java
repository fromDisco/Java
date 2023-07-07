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
 * @param number int to convert
 * @return string Roman numeral
 * @see <a href="https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java">https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java</a>
 */
public class RomanNumerals {
    public static String solution(int number) {
        // SortedMap<Integer, String> romans = new TreeMap<>();
        LinkedHashMap<String, Integer> romans = new LinkedHashMap<>();
        // two dummy values for first interation -> convertion is only done till 3999.
        romans.put("XX", 1000);
        romans.put("DD", 1000);
        romans.put("M", 1000);
        romans.put("D", 500);
        romans.put("C", 100);
        romans.put("L", 50);
        romans.put("X", 10);
        romans.put("V", 5);
        romans.put("I", 1);

        // initialize iterator from romans HashMap
        Iterator<Map.Entry<String, Integer>> iterator = romans.entrySet().iterator();

        // initialize variables before loop
        Map.Entry<String, Integer> big = iterator.next();
        Map.Entry<String, Integer> middle = iterator.next();
        Map.Entry<String, Integer> small = iterator.next();

        // quotient is actual number to convert
        int quotient = 0;
        String romanNumber = "";

        while (iterator.hasNext()) {
            quotient = number / small.getValue();
            number = number % small.getValue();
            // update roman number with actual converted value
            romanNumber += getRomanNumeral(quotient, big, middle, small);

            // reassign values, so that small value is now big.
            big = small;
            middle = iterator.next();
            small = iterator.next();
        }

        // process numbers smaller 10
        quotient = number / small.getValue();
        romanNumber += getRomanNumeral(quotient, big, middle, small);

        return romanNumber;
    }

    // convert actual quotient to matching roman number
    public static String getRomanNumeral(int quotient,
                                         Map.Entry<String, Integer> big,
                                         Map.Entry<String, Integer> middle,
                                         Map.Entry<String, Integer> small) {
        String character = "";
        if (quotient < 4) {
            character += small.getKey().repeat(quotient);
        } else if (quotient == 4) {
            character += small.getKey() + middle.getKey();
        } else if (quotient == 5) {
            character += middle.getKey();
        } else if (quotient > 5 && quotient < 9) {
            character += middle.getKey() + small.getKey().repeat(quotient - 5);
        } else if (quotient == 9) {
            character += small.getKey() + big.getKey();
        }

        // return converted value of actual iteration
        return character;
    }
}
