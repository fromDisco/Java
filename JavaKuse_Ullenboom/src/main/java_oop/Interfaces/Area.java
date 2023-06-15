package Interfaces;

public interface Area {
    double area();

    // its possible to use private attributes in interfaces
    // as long the are not required from the outside
    private int max() {
        return 100;
    }

    // default method
    default boolean isBig() {
        return area() > max();
    }
}
