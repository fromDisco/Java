public class CharDataTypes {
    public static void main(String[] args) {
        // usings primitive datatype char and class Character
        chars();

        // using Strings
        // Strings are immutable
        strings();
    }


    /**
     * @see Character
     * char is a primitive datatype
     * i can be coverted to int and vice versa
     * because it is a 2 byte big number
     * primitive Datatypes don't have methods
     * Character Class provides helper methods
     * and a wrapper-object
     */
    public static void chars() {
        // char is by default a 2 byte big number
        char c = 'a'; // 2 Bytes, 0... 64k

        // by adding, subtracting ... its type is converted
        int frankenstein = c + 1;
        System.out.printf("char to int: %d%n", frankenstein); // -> 98; type conversion

        // casting
        char follower = (char)(c + 1);
        System.out.printf("type casting. next to %s comes: %s%n", c, follower);

        // loop from uppercase A to lowercase z
        // some non word chars are in between
        System.out.println("# Loop over char letters");
        for (char abc = 'A'; abc <= 'z'; abc++) {
            System.out.print(abc);
        }

        // loop from uppercase A to lowercase z
        // some non word chars are in between
        System.out.printf("%n# Loop over int correspondences of letters%n");
        for (int abc = 'A'; abc <= 'z'; abc++) {
            System.out.printf("%d, ", abc);
        }
        System.out.println();

        // hexadecimals -> char
        char hex = '\u004d';
        System.out.println("\\u004d hex as letter: " + hex);

        // ######################################
        // ######################################
        // Class Character
        // primitive Datatypes like char have no methods to use
        // Character servers:
        // 1. helper methods
        // 2. Wrapper
        boolean is_white = Character.isWhitespace(' ');
        System.out.println("Is ' ' a whitespace: " + is_white);

        boolean is_tab_white = Character.isWhitespace('\t');
        System.out.println("Is '\\t' a whitespace: " + is_tab_white);

        boolean is_a_letter = Character.isLetter('A');
        System.out.println("Is 'A' a letter: " + is_a_letter);

        boolean is_0_letter = Character.isLetter('0');
        System.out.println("Is '0' a letter: " + is_0_letter);

        boolean is_0_digit = Character.isDigit('0');
        System.out.println("Is '0' a digit: " + is_0_digit);
    }

    private static void strings() {
        String name = "Tree";
        // String provides methods e.g.
        System.out.println(".charAt(): " + name.charAt(2));
        System.out.println(".toUpperCase(): " + name.toUpperCase());

        // StringBuilder
        StringBuilder bodyBuilder = new StringBuilder();
        bodyBuilder.append("Get ");
        bodyBuilder.append("Bigger.");
        System.out.println("result of bodyBuilder.append(): " + bodyBuilder);
        bodyBuilder.reverse();
        System.out.println("result of bodyBuilder.reverse(): " + bodyBuilder);

    }
}
