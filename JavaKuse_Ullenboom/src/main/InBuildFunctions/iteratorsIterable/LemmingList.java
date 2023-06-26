package iteratorsIterable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class LemmingList implements Iterable<Lemming> {
    private ArrayList<Lemming> lemmingsList = new ArrayList<>();

    public void add(Lemming... lemmings) {
        this.lemmingsList.addAll(Arrays.asList(lemmings));
    }

    @NotNull
    @Override
    public Iterator<Lemming> iterator() {
        // READONLY: prevent deleting or modifiying elements of iterator
        return Collections.unmodifiableCollection(this.lemmingsList).iterator();
    }
}
