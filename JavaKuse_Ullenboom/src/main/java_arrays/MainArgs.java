import java.math.BigInteger;

public class MainArgs {

    /**
     * Returns {@code true} if for every argument thats passed,
     * @see java.math.BigInteger#isProbablePrime(int)
     * @param  args is an array of numbers
     * @return {@code true} if this number is probably prime,
     *         {@code false} if it's definitely composite.
     */
    public static void main(String[] args) {
        // loop through cli arguments
        for (String arg : args) {
            BigInteger bigInteger = new BigInteger(arg);
            boolean is_prime = bigInteger.isProbablePrime(100);
            System.out.printf("%s is a prime: %b%n", arg, is_prime);
        }
    }
}
