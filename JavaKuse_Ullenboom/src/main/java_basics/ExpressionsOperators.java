public class ExpressionsOperators {
    public static void main(String[] args) {
        int age; // declaration of a variable
        System.out.println(age = 90); // variable gets initialized
        System.out.println(age);

        System.out.println(Math.random()); // 0.0 <= Math.rondom() <= 1.0
        System.out.println(-Math.random()); // unary operator negates to -1.0 <= Math.rondom() <= 0.0

        int number = 10_000_000;
        System.out.println("overflow: " + number * number); // creates overflow. Number is bigger than int

        long long_int = 10_000_000;
        System.out.println("long int: " + long_int * long_int); // prevent overflow with long data type

        System.out.println(10 / 3); // result of deviding two integers is int
        System.out.println(10.0 / 3); // if float is desired, one number has to be float
        double to_divide = 10;
        System.out.println(to_divide / 3);

        System.out.println( true || false);

    }
}
