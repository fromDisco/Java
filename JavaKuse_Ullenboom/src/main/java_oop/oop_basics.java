public class oop_basics {
    public static void main(String[] args) {
        // reference types         = object type
        java.awt.Point basic_point = new java.awt.Point();
        System.out.println(basic_point);
        basic_point.x = 3;
        System.out.println(basic_point.x);
        System.out.println(basic_point);
        System.out.println(basic_point.toString());
        System.out.println(basic_point.toString().length());
    }
}