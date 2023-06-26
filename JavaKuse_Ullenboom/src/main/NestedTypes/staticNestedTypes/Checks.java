package staticNestedTypes;

import java.util.Objects;
import java.util.function.Predicate;

public class Checks {
    public static class NonNull implements Predicate<Object> {

        @Override
        public boolean test(Object o) {
            return o != null;
        }
    }
}
