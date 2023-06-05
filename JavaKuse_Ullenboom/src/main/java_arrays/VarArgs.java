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
    }

    public static void intOutput(int number) {
        System.out.println(number);
    }
    public static void intOutput(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
