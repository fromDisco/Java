package utilOptional;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optional makes it possible to return a value thats not null,
 * even if the value is not present.
 * @see <a href="https://www.baeldung.com/java-optional">Optional recource</a>
 */
public class UtilOptional {
    public static void main(String[] args) {
        optional();
        getOptionalValues();
    }

    public static void optional() {
        // .empty()
        Optional<Object> empty = Optional.empty();
        System.out.println("empty: " + empty);
        System.out.println("is content present: " + empty.isPresent());
        try {
            System.out.println(empty.get());
        } catch (NoSuchElementException npe) {
            System.err.println("empty.get() throws NoSuchElementException");
        }
        System.out.println("empty.orElse(\"Default Value\"): " + empty.orElse("Default Value"));

        // .of()
        Optional<String> string = Optional.of("Here I am.");
        System.out.println("\nstring: " + string);
        System.out.println("is content present: " + string.isPresent());
        System.out.println("string.get(): " + string.get());

        // .ofNullable()
        Optional<Object> ofNull = Optional.ofNullable(null);
        System.out.println("\nofNull: " + ofNull);
        System.out.println("is content present: " + ofNull.isPresent());
        try {
            System.out.println(ofNull.get());
        } catch (NoSuchElementException npe) {
            System.err.println("ofNull.get() throws NoSuchElementException");
        }
        System.out.println("ofNull.orElse(\"Default Value\"): " + ofNull.orElse("Default Value"));

        // .ofNullable
        Optional<String> ofNullString = Optional.ofNullable("Again.");
        System.out.println("\nofNullString: " + ofNullString);
        System.out.println("is content present: " + ofNullString.isPresent());
    }

    public static void getOptionalValues() {
        Person person = new Person();
        System.out.println("\nPersons spouse: " + person.getSpouse());
    }
}

