package Interfaces;

public interface Perimeter {
    double getPerimeter();

    default boolean isBig() {
        return getPerimeter() > 200;
    }
}
