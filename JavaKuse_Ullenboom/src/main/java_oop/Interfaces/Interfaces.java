package Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Square square01 = new Square(3, 4);
        System.out.println("square01.area() -> " + square01.area());
        System.out.println("square01.getPerimeter() -> " + square01.getPerimeter());

        Square square02 = new Square(3, 5);
        System.out.println("\nsquare02.area() -> " + square02.area());
        System.out.println("square02.getPerimeter() -> " + square02.getPerimeter());

        Circle circle01 = new Circle(4);
        System.out.println("\ncircle01.area() -> " + circle01.area());
        System.out.println("circle01.getPerimeter() -> " + circle01.getPerimeter());

        // instantiate RepeatingChars that implemented CharSequence
        CharSequence sequence = new RepeatingChars(10, 'k');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hallo");
        stringBuilder.append(sequence);
        System.out.println(stringBuilder.toString());
    }
}
