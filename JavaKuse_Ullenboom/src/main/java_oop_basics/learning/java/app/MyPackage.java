package learning.java.app;
import learning.java.util.Distance;

public class MyPackage {
    // instance variables
    int x;
    int y;

    // constructor
    public MyPackage(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance() {
        return Distance.distance(this.x, this.y);
    }
}
