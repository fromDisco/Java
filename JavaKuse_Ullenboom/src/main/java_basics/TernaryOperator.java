public class TernaryOperator {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        double result = a > b ? a : b;
        System.out.println("winner: " + result);
        System.out.printf("only with two digits: %.2f", result);


    }
}
