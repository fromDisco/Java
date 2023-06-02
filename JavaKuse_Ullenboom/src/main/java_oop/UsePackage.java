import learning.java.app.MyPackage;

public class UsePackage {
    public static void main(String[] args) {
        MyPackage instance = new MyPackage(4, 4);
        double the_distance = instance.getDistance();
        System.out.println(the_distance);
    }
}
