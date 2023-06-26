package wrappersAutoboxing;

import java.util.ArrayList;

/**
 * <p>Wrappers provide helper methods for primitive data types</p>
 *
 * <p>Wrapper types:
 * <p>byte -> Byte
 * <p>short -> Short
 * <p>int -> Integer
 * <p>long -> Long
 * <p>float -> Float
 * <p>double -> Double
 * <p>char -> Character
 * <p>boolean -> Boolean
 */
public class WrappersAutoboxing {
    public static void main(String[] args) {
        // create instance of char. Constructors are depricated, so .valueOf() should be used
        char c = Character.valueOf('H');

        ArrayList<Integer> numList = new ArrayList<>();
        // both alternatives work. Adding a primitive and a Wrapper
        numList.add(Integer.valueOf(1));
        numList.add(1); // -> autoboxing: int gets converted into Integer // -> autoboxing: int gets converted into Integer
        System.out.println(numList);

        // other methods available for Integer Wrapper
        /*
          - valueOf()
          - toString()
          - parseXXX()
          - compare()
          - hashCode(int num) -> static method
          - hashCode()
         */
        System.out.println(Integer.hashCode(9));

        boxingUnboxing();
    }

    public static void boxingUnboxing() {
        // Autoboxing
        Character c1 = 'c';
        Integer i1 = 1;
        Long l1 = 12L;

        // Unboxing
        char c2 = c1;

        // values -128 ... 127 (1 byte) get cached by Integer.valueOf()
        // Integer.IntegerCache is responsible for this cache
        // everthing else is instantiated and get own instance
        // so "1 == 1" is true
        // while "200 == 200" is false
        Integer n01 = 1;
        Integer n02 = 1;
        Integer n03 = 200;
        Integer n04 = 200;
        System.out.println(n01 == n01);
        System.out.println(n03 == n04);
    }
}
