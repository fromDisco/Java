public class GarbageCollector {
    public static void main(String[] args) {
        java.util.Stack stack = new java.util.Stack();
        boolean infinite = false;

        while (infinite) {
            stack.push(new java.awt.Point());
        }
    }
}
