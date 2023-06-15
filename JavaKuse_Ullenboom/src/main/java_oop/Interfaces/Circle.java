package Interfaces;

/**
 * instead of implementing two seperate Interfaces,
 * this Class implements AreaAndPerimeter, that combines both Interfaces
 * <p>
 * And this class also implements a MarkerInterface,
 * that doesn't include any methods,
 * but signals that this class provides special methods
 * @see AreaAndPerimeter
 */
public class Circle implements AreaAndPerimeter, MarkerInterface {
    int radius;

    // Constructors
    Circle(int radius) {
        this.radius = radius;
    }

    // Setters / Getters
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
