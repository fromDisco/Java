public class CopyReferenceAndPassByValue {
    public static void main(String[] args) {
        int age = 44;
        int my_age = age;
        age = 40;
        // here the value 44, not the reference, is copied to my_age,
        // so age can be modified and my_age isn't affected
        System.out.println(my_age);

        java.awt.Point point = new java.awt.Point();
        java.awt.Point point2 = point;
        point.x = 2;
        // here point and point2 reference the same object
        // by changing one, the other is changed, too.
        System.out.println("point: " + point);
        System.out.println("point2: " + point2);

        // only reference is affected, not the object.
        // point2 has reference to object -> old reference deleted, new reference defined
        point2 = new java.awt.Point();
        System.out.println("point after: " + point);
        System.out.println("point2 after: " + point2);
    }
}
