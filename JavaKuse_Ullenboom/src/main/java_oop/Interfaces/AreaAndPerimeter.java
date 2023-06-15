package Interfaces;

/**
 * No own methods, because AreaAndPerimeter only combines Area and Perimeter
 * @see Perimeter
 * @see Area
 */
public interface AreaAndPerimeter extends Area, Perimeter {
    // .isBig() is default method of Area and Perimeter
    // resolve conflict by defining which Interface method to include
    @Override
    default boolean isBig() {
        return Area.super.isBig();
    }
}
