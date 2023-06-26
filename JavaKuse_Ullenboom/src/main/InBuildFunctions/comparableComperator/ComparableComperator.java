package comparableComperator;

import java.time.LocalTime;
import java.util.*;

public class ComparableComperator {
    public static void main(String[] args) {
        System.out.println("\"abc\".compareTo(\"bcd\") = " + "abc".compareTo("bcd")); // -1
        System.out.println("\"bcd\".compareTo(\"abc\") = " + "bcd".compareTo("abc")); // 1
        System.out.println("\"abc\".compareTo(\"abc\") = " + "abc".compareTo("abc")); // 0

        LocalTime now = LocalTime.of(10, 42);
        LocalTime then = LocalTime.of(11, 43);
        System.out.println("\nnow.compareTo(then) = " + now.compareTo(then));

        List<LocalTime> times = new ArrayList<>();
        times.add(LocalTime.now());
        times.add(LocalTime.now().plusHours(1));
        times.add(LocalTime.now().plusHours(-1));
        System.out.println("\n# LocalTime uses 'comparable' to compare values:");
        System.out.println(times);
        System.out.println("# Collections.max(times):");
        System.out.println(Collections.max(times));
        System.out.println("# Collections.min(times):");
        System.out.println(Collections.min(times));
        System.out.println("# Collections.sort(times):");
        Collections.sort(times);
        System.out.println(times);

        // .compareTo()
        IncludeComparable includeComparable01 = new IncludeComparable(6, 2);
        IncludeComparable includeComparable02 = new IncludeComparable(5, 4);
        System.out.println("\n# Writing custom .compareTo() methods:");
        System.out.println(includeComparable01.compareTo(includeComparable02));

        // Comparator
        // instantiating the Comparators. Each Comparator is speacialized
        Comparator<IncludeComparator> number1Comparator = new NumberComparator();
        Comparator<IncludeComparator> number2Comparator = new Number2Comparator();
        // instantiating the object to compare
        IncludeComparator includeComparator01 = new IncludeComparator(5, 2);
        IncludeComparator includeComparator02 = new IncludeComparator(5, 4);
        // each Comparator checks one attribute
        int compareResult1 = number1Comparator.compare(includeComparator01, includeComparator02);
        int compareResult2 = number2Comparator.compare(includeComparator01, includeComparator02);
        System.out.println("\n# Comparator of : " + includeComparable01 + " + " + includeComparable02);
        System.out.println(compareResult1);
        System.out.println(compareResult2);

        // chaining different comparators, if first comparator returns 0, then second is excecuted
        System.out.println("\n# .thenComparing()");
        Comparator<IncludeComparator> number1AndNumber2 = number1Comparator.thenComparing(number2Comparator);
        List<IncludeComparator> comparison = new ArrayList<>();
        comparison.add(includeComparator01);
        comparison.add(includeComparator02);
        System.out.println("# result of Collections.max(list, c1.thenComparing(c2)): ");
        System.out.println(Collections.max(comparison, number1AndNumber2));
    }
}