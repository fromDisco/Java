public class LoopWhile {
    public static void main(String[] args) {
        int number = 12345678;
        int counter = 0;
        // how many digits does a number have
        while (number != 0) {
            number /= 10;
            counter++;
        }

        int count = 0;
        final int LIMIT = 50;
        while (Math.random() > 0.00001) {
            if (count >= LIMIT) {
                System.out.println("Count broke loop at: " + count);
                break;
            }
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("The number has: " + counter + " numbers.");
    }
}
