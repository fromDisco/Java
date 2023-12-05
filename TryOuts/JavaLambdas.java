import java.util.function.IntSupplier;

public class JavaLambdas {

    public static IntSupplier lambdaHereLambdaThere() {
        int next = 1;
        return () -> next++;
    }

    public static void main(String[] args) {
        System.out.println("lambdaHereLambdaThere() = " + lambdaHereLambdaThere());
        System.out.println("lambdaHereLambdaThere() = " + lambdaHereLambdaThere());

    }
}