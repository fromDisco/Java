package Interfaces;

public class Square implements Area, Perimeter {
    int width;
    int length;

    // Constructors
    Square(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // default methods conflict
    // implement and overwrite conflicting methods
    public boolean isBig() {
        // make a decision which default-method to call
        return Area.super.isBig();
    }

    // Setters / Getters
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    // other Methods
    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.width + 2 * this.length;
    }
}
