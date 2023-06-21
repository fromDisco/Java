package UtilObjects;

import java.util.Objects;

public class UtilObjects {
    public static void main(String[] args) {
        String one = "Hello";
        String two = null;
        String three = null;
        System.out.println("\"Hello\".equals(null) : " + one.equals(two));
        try {
            System.out.println("null.equals(\"Hello\") : " + two.equals(one));
        } catch (NullPointerException npe) {
            System.out.println("null.equals(\"Hello\") results in NullPointerException!");
        }

        // Objects.equals
        boolean isEqual = Objects.equals(null, "Hello");
        System.out.println("\n# Objects.equal() isn't throwing NPE if \"one\" is 'null'.");
        System.out.println("Objects.equal(null, \"Hello\"): " + isEqual);
        boolean isEqual2 = Objects.equals(null, null);
        System.out.println("Objects.equal(null, null): " + isEqual2);

        // Objects.compare
        System.out.println("\n# Objects.compare(null, null, String.CASE_INSENSITIVE_ORDER):");
        System.out.println(Objects.compare(null, null, String.CASE_INSENSITIVE_ORDER));

        // Objects.requireNonNull
        String isNull = null;
        // .requireNonNull() throws NPE
        // String variable = Objects.requireNonNull(isNull, "");
        // .requireNonNullElse() throws no NPE
        String variable2 = Objects.requireNonNullElse(isNull, "");


    }
}

