public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(random(10));
        System.out.println(random(5, 10));
    }

    // method calls with no argumenst call this methods
    static double random() {
        return Math.random();
    }

    // method calls with one argument call this method
    static double random(int max) {
        // this makes the second parameter optional
        // this method calls random(min, max) in any case,
        // but always sets the default min to 0
        // code duplication is prevented
        // random(min, max) can be changed, without the need to change this method
        return random(0, max);
    }

    // method calls with two arguments call this method
    static double random(int min, int max) {
        return min + (Math.random() * (max - min));
    }
}
