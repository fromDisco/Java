package iteratorsIterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterable<Integer> {
    final int start;
    final int end;

    private RangeIterator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    static Iterable<Integer> range(int start, int end) {
        return new RangeIterator(start, end);
    }

    @Override
    public Iterator<Integer> iterator() {
        class InternalRangeIterator implements Iterator {
            int counter = start;

            @Override
            public boolean hasNext() {
                return counter < end;
            }

            @Override
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Iterator ran out of elements.");
                }
                return counter++;
            }
        }
        return new InternalRangeIterator();
    }
}
