public class Datatypes {
    public static void main(String[] args) {
        // byte --> 1 Byte
        byte one_byte = -128; // -128 .. +127
        // short --> 2 Bytes
        short two_short = -32768; // -32768 ... 32767
        // int --> 4 Bytes
        int four_int = 2147483647; // -2147.483.648 ... 2.147.483.647
        // long --> 8 Bytes
        long eight_long  = -9223372036854775808L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807;
        // float --> 4 Bytes
        float four_float = 1.1234567F; // float with up to 7 digits
        // double --> 8 Bytes
        double eight_double = 1.123456789012345;
        // char --> 2 Bytes
        char two_char = 'A'; // one unicode char from \u0000 to \uffff, only single quote
        // String --> ...
        String words = "Weekend is here."; // string is wrapped in double quotes
        // bool --> 1 Byte
        boolean one_bool = true;
        // Constant double
        final double PI = 3.1415;

        System.out.println(PI);
    }
}
