package NestedType;

public class App {
    public static void main(String[] args) {
        NestedTypes nestedTypes = new NestedTypes("Who");
        NestedTypes.Contains doesIt = nestedTypes.new Contains();
        System.out.println(doesIt.containsString("ho"));
        System.out.println(doesIt.containsString("bla"));
    }
}
