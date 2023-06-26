package comparableComperator;

import java.util.Comparator;

public class Number2Comparator implements Comparator<IncludeComparator> {

    @Override
    public int compare(IncludeComparator o1, IncludeComparator o2) {
        return o1.number2 - o2.number2;
        // return Double.compare(o1.number2, o2.number2);
    }
}
