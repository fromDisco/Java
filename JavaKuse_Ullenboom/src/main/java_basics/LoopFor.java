public class LoopFor {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                // %3d makes sure that number as always 3 (empty) digits
                System.out.printf("%3d ", x * y);
            }
            System.out.println("");
        }
    }
}
