package NestedType;

import javax.sql.RowSet;
import java.util.function.Predicate;
import java.sql.SQLException;

public class AnonymousClass {

    // anonymous Class expression
    Predicate<String> emptyPredicate = new Predicate() {
        @Override
        public boolean test(Object o) {
            return false;
        }
    };
}
