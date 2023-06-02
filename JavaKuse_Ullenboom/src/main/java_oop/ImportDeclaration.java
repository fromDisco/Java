import java.awt.Point;
import java.util.Scanner;

public class ImportDeclaration {
    public static void main(String[] args) {
        //  System.out.print("x = ");
        //  int x = new java.util.Scanner(System.in).nextInt();
        //  System.out.print("y = ");
        //  int y = new java.util.Scanner(System.in).nextInt();
        //  java.awt.Point point = new java.awt.Point(x, y);
        //  System.out.println(point.distance(0, 0));

        System.out.print("x = ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("y = ");
        int y = new Scanner(System.in).nextInt();
        Point point = new Point(x, y);
        System.out.println(point.distance(0, 0));
    }

}
