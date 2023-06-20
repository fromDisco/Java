package CustomExceptionWithThrow;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomExceptionWithThrow {

    public static void main(String[] args) {
        printSqrt(.3399);

        Path path = Paths.get("file.txt");
        try {
            printFilePath(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int product = multiplyTwoNums(1111111, 2222222);
        System.out.println(product);
    }

    private static int multiplyTwoNums(int num01, int num02) {
        try {
            return Math.multiplyExact(num01, num02);
        } catch (ArithmeticException ae) {
            // handle situation, process data e.g. log error, make statistics etc.
            System.err.println("product of num01: " + num01 + " num02: " + num02 + " is too big for int.");
            // rewrite stack trace
            ae.fillInStackTrace();
            // rethrow exception
            throw ae;
        }
    }

    private static void printFilePath(Path path) throws IOException {
        if (path == null) {
            throw new IOException();
        }
        System.out.println("Found it!");
        // ...
    }

    private static void printSqrt(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Argument " + num + " has to be > 0.");
        }
        System.out.println(Math.sqrt(num));
    }
}
