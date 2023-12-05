package NestedType;

import javax.sql.rowset.Predicate;

public class NestedTypes {
    String string;

    public NestedTypes(String string) {
        this.string = string;
    }

    /**
     * As long as object of this nested class excists,
     * the reference to the parent object will also excist.
     * --> this can block memory
     */
            // nested class can access attributes and methods of parent class
            // Access 'this' of parent class
            return NestedTypes.this.string.contains(string);
        }
    }
}
