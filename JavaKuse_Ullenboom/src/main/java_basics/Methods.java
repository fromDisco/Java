public class Methods {
    public static void main(String[] args) {
        lines(10);

    }

    static void lines(int num) {
        for (int i = 0; i < 10; i++) {
            printChar('æ');
        }
    }

    static void printChar(char c) {
        System.out.print(c);
    }
}
