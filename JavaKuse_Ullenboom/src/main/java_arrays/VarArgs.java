public class VarArgs {
    public static void main(String[] args) {
        intOutput(1, 3, 5, 7, 11);

        System.out.println("__with VarArgs__");
        int[] numbers_2 = new int[]{10, 9, 8, 7};
        intOutput(numbers_2);

        // varargs are performance heavy, because the create an object all the time
        // so by overloading the method, we can sort out the cases, where its not necessary
        System.out.println("__without VarArgs__");
        intOutput(3);

        System.out.println("__Max number__");
        int max =  max(2, 8, 9, 100, 7);
        System.out.println(max);

        System.out.println("__varArgs and null__");
        varArgsLength("", ""); // --> converted to array
        varArgsLength("", null); // --> converted to array
        varArgsLength(null, null); // --> converted to array
        // --> is NullPointerExeption, because varArgs could be a variable referring an array and this reference is null
        // varArgsLength(null);
        varArgsLength((String) null); // prevent conversion to array, by defining the type of the variable
    }

    // just take one argument
    public static void intOutput(int number) {
        System.out.println(number);
    }

    // for more than one argument take varArgs
    public static void intOutput(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static int max(int num1, int num2, int... nums) {
        int max = Math.max(num1, num2);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    static void varArgsLength(String... words) {
        System.out.println(words.length);
    }
}
