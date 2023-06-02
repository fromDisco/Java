public class BitOperators {
    public static void main(String[] args) {
        int bit1 = 0b10101010; // attention we are not using the full 32 bits here, 0 to the left are not shown
        int bit2 = 0b11010101;
        System.out.println("Binary Numbers:");
        System.out.println(Integer.toBinaryString(bit1));
        System.out.println(Integer.toBinaryString(bit2));

        System.out.println("negated Binary Numbers:");
        System.out.println(Integer.toBinaryString(~bit1)); // ~ negates the binary num, here all 0 turn to 1.
        // Now all 0 on the left turn to 1 and are shown.
        System.out.println(Integer.toBinaryString(~bit2)); // ~ negates the binary num, here all 0 turn to 1.

        System.out.println("&:");
        System.out.println(Integer.toBinaryString(bit1 & bit2));
        System.out.println("|:");
        System.out.println(Integer.toBinaryString(bit1 | bit2));
        System.out.println("^|:");
        System.out.println(Integer.toBinaryString(bit1 ^ bit2));
    }
}
