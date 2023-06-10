package IsInArray;

public class Client {
    public static void main(String[] args) {
        boolean result1 = IsInArray.check(new Object[] {66, 101}, 66); // true
        System.out.println(result1);
        boolean result2 = IsInArray.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45); // true);
        System.out.println(result2);
        boolean result3 = IsInArray.check(new Object[] {'t', 'e', 's', 't'}, 'e'); // true);
        System.out.println(result3);
        boolean result4 = IsInArray.check(new Object[] {"what", "a", "great", "kata"}, "kat"); // false);
        System.out.println(result4);
    }
}
