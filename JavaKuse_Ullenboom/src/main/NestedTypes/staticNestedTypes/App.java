package staticNestedTypes;

public class App {
    public static void main(String[] args) {
        // static NonNull.class can be used without instance of Checks.class
        Checks.NonNull nonNull = new Checks.NonNull();
        System.out.println("nonNull.test(null) -> " + nonNull.test(null));
        System.out.println("nonNull.test(1) -> " + nonNull.test(1));
    }
}
