public class LoopDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("only one time");
        } while ( Math.random() > 0.3 );

        int input;
        int result = 0;
        do {
            System.out.println("Type your number:");
            input = new java.util.Scanner(System.in).nextInt();
            result += input;
        } while (input != 0);

        System.out.println(result);
    }
}
