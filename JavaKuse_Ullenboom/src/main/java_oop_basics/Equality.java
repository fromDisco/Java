public class Equality {
    public static void main(String[] args){
        java.awt.Point point1 = new java.awt.Point(1, 0);
        java.awt.Point point2 = new java.awt.Point(1, 0);

        // point1 and point2 are refer to different objects, so they are not equal
        System.out.println("# point1 and point2 are different objects -> point1 == point2");
        System.out.println(point1 == point2);

        // but point1 and point2 have the same state, even if they are not the same object
        System.out.println("# point1 and point2 have the same state -> point1.equals(point2)");
        System.out.println(point1.equals(point2));
        point2.x = 2;
        System.out.println(point1.equals(point2));

        // because a String is an object == doesn't work when comparing strings
        String unique = "one";
        String unique_2 = "one";
        System.out.println("# compiler recognized that both strings are the same -> string interning, both variables point to the same object");
        System.out.println(unique == unique_2);

        String unique_3 = new String("one");
        String unique_4 = new String("one");
        System.out.println("# Strings created with new, create two different objects, even if they contain the same string");
        System.out.println(unique_3 == unique_4);
        System.out.println(unique_3.equals(unique_4));
    }
}
