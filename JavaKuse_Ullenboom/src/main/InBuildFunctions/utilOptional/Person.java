package utilOptional;

import java.util.Objects;
import java.util.Optional;

public class Person {
    // never use Optional as internal data type
    // just use it as API response, to signal that there is no value
    private Person spouse;

    public void setSpouse(Person spouse) {
        this.spouse = Objects.requireNonNull(spouse);
    }

    public void removeSpouse() {
        this.spouse = null;
    }

    public Optional<Person> getSpouse() {
        // return Optional instead of null
        return Optional.ofNullable(this.spouse);
    }
}
