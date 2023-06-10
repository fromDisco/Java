import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {
        // String.isEmpty() -> Checks if String is "" or null;
        isEmpty();

        // String.isBlank() -> Checks if String contains an empty string or only spaces
        isBlank();

        // String.charAt() -> returns char at given index
        charAt();

        // .isDigit()
        isDigit();

        // .indexOf() -> search
        indexOf();

        // .indexOf(char, fromIndex) --> find all indexes of char
        indexFromOf();

        // .equals() and .equalsIgnoreCase()
        equals();

        compareTo();

        // .join()
        join();

        // .toUpperCase(), .toLowerCase()
        toUpperLowerCase();

        // .replace()
        replace();

        // .split()
        splitString();

        // .matches()
        matches();

        // .getFileEnding
        getFileEnding();
    }

    private static void isEmpty() {
        // .isEmpty()
        System.out.println("# .isEmpty(), .isBlank():");
        String empty = "";
        System.out.printf("Is \"\" empty: %b", empty.isEmpty());

        String notEmpty = "I think, i am.";
        System.out.printf("%nIs \"%s\" empty: %b", notEmpty, notEmpty.isEmpty());
    }

    private static void isBlank() {
        // white spaces
        String whiteSpace = "  ";
        System.out.printf("%nIs \"%s\" empty: %b", whiteSpace, whiteSpace.isEmpty());
        // .isBlank() checks for whitespaces or empty strings
        System.out.printf("%nIs \"%s\" blank: %b%n", whiteSpace, whiteSpace.isBlank());
    }

    private static void charAt() {
        System.out.printf("%n# .charAt():");
        String letters = "Speak Friend and ...";
        System.out.printf("%n\"%s\".charAt(6): %s%n", letters, letters.charAt(6));
    }

    private static void isDigit() {
        System.out.printf("%n# Character.isDigit():");
        String mixed = "H3LL0";
        char is_digit = mixed.charAt(1);
        System.out.printf("%nIs '%s' a digit: %b%n", is_digit, Character.isDigit(is_digit));
    }

    private static void indexOf() {
        System.out.printf("%n# .indexOf(char):");
        String whereAmI = "I love to ride my bycicle";
        int hereIAm = whereAmI.indexOf('o');
        System.out.printf("%nChar 'o' in \"%s\" is at index: %d%n", whereAmI, hereIAm);
    }

    private static void indexFromOf() {
        System.out.printf("%n# .indexOf(char, fromIndex):%n");
        String whereAmI = "I love to ride my bycicle";
        List<Integer> indexesOfChar = new ArrayList<>();
        // initial value is -1 so, that fromIndex of .indexOf is 0 at first loop
        int lastIndex = -1;

        do {
            lastIndex = whereAmI.indexOf('e', lastIndex + 1);
            indexesOfChar.add(lastIndex);
        } while(indexesOfChar.get(indexesOfChar.size() - 1) != -1);

        String array = indexesOfChar.toString();
        System.out.println(array);
    }

    private static void equals() {
        System.out.printf("%n# String.equals():%n");

        System.out.println("\"abc\".equals(\"abc\"): " + "abc".equals("abc"));
        System.out.println("\"abc\".equals(\"ABC\"): " + "abc".equals("ABC"));
        System.out.println("\"abc\".equalsIgnoreCase(\"ABC\"): " + "abc".equalsIgnoreCase("ABC"));
    }

    public static void compareTo() {
        System.out.printf("%n# String.compareTo():%n");

        System.out.println("\"abc\".compareTo(\"abc\"): " + "abc".compareTo("abc")); // --> equal = 0
        System.out.println("\"abc\".compareTo(\"cde\"): " + "abc".compareTo("cde")); // --> first < second = -x
        System.out.println("\"cde\".compareTo(\"abc\"): " + "cde".compareTo("abc")); // --> first > second = x
    }

    private static void join() {
        System.out.printf("%n# String.join():%n");
        String[] letters = {"T", "i", "r", "e", "d"};
        String word = String.join("", letters);
        System.out.printf("String.join(\"\", [\"T\", \"i\", \"r\", \"e\", \"d\"]) --> %s%n",  word);
    }

    private static void toUpperLowerCase() {
        System.out.printf("%n# .toUpperCase(), toLowerCase():%n");
        System.out.println("abc" + " -> " + "abc".toUpperCase());
        System.out.println("ABC" + " -> " + "ABC".toLowerCase());
        // ß gets converted to SS
        System.out.println("ß" + " -> " + "ß".toUpperCase(Locale.ROOT));
    }

    private static void replace() {
        System.out.printf("%n# .replace():%n");
        System.out.println("Replace 'e' in \"Hello\" -> " + "Hello".replace('e', 'a'));
        System.out.println("Remove \" World\" from \"Hello World\" -> " + "Hello World".replace(" World", ""));
    }

    private static void splitString() {
        System.out.printf("%n# .split():%n");
        String[] split = "Today0i1will2work3on4my5first6project7with8Patrick9and0Maximilian.".split("\\d");
        System.out.println("Today0i1will2work3on4my5first6project7with8Patrick9and0Maximilian.");
        System.out.println(Arrays.toString(split));
        System.out.println(String.join(" ", split));
    }

    private static void matches() {
        System.out.printf("%n# .matches():%n");
        System.out.println("\"1234\".matches(\"\\d+\") --> " + "1234".matches("\\d+"));
        System.out.println("\"1b34\".matches(\"\\d+\") --> " + "1b34".matches("\\d+"));
        System.out.println("\"1234 \".matches(\"\\d+\") --> " + "1234 ".matches("\\d+"));
    }

    private static void getFileEnding() {
        String fileName = "neo.vim.tXt   ";
        String[] fileArray = fileName.trim().split("\\.");

        // has to be type casted, because return value is of type Object
        String fileEnding = (String)Array.get(fileArray, 1);
        // only matches, if there is no dot in the filename
        if (fileEnding.toLowerCase().equals("txt")) {
            System.out.println("We have a match.");
        }

        // matches even if there are dots in the filename
        int lastIndexOf = fileName.lastIndexOf(".");
        String name = fileName.substring(0, lastIndexOf);
        System.out.println(name);

    }
}
