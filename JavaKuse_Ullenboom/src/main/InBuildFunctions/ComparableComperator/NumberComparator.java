package ComparableComperator;

import java.util.Comparator;

public class NumberComparator implements Comparator<IncludeComparator> {

    @Override
    public int compare(IncludeComparator o1, IncludeComparator o2) {
        return o1.number - o2.number;
    }
}
