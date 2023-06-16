package CodeWars_8kyu.IsInArray;

import java.util.Arrays;

public class IsInArray {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
