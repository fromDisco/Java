public class SwitchStatementsJava14 {
    public static void main(String[] args) {
        int num = 3;
        // new switch case syntax
        switch (num) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3, 4 -> System.out.println("more than two");
            default -> System.out.println("out of border");
        }

        // switch statement!
        String output = switch (num) {
            case 1 -> {
                System.out.println("Here i am in 1.");
                yield "one";
            }
            case 2 -> "two";
            case 3, 4 -> "more than two";
            default -> "out of border";
        };
        System.out.println("Second switch result: " + output);

    }
}
