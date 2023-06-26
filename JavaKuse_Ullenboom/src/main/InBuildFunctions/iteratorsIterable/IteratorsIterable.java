package iteratorsIterable;

import java.util.Iterator;

public class IteratorsIterable {
    public static void main(String[] args) {
        Lemming lemming01 = new Lemming("Walter", "grey");
        Lemming lemming02 = new Lemming("Kevin", "brown");
        LemmingList lemmingList = new LemmingList();
        lemmingList.add(lemming01, lemming02);

        Iterator llist = lemmingList.iterator();
        while (llist.hasNext()) {
            System.out.println(llist.next());
        }

        System.out.println("\n# Range:");
        for (Integer num : RangeIterator.range(2, 6)) {
            System.out.println(num);

        }
    }
}
