package staticNestedTypes;

public class StaticNestedTypes {
    public static void main(String[] args) {
        Checks.NonNull nonNull = new Checks.NonNull();
        System.out.println(nonNull.test(null));
    }
}
