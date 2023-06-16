package CodeWars_8kyu.RomanNumberals;

public class RomanNumerals {
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
    public static String solution(int number) {
        int rest;
        int thousand = (int)number / 1000;
        rest = number % 1000;

        int hundert = rest / 100;
        rest = rest % 100;

        return "";
    }
}
