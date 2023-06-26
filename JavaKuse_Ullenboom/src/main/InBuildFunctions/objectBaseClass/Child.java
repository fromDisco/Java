package objectBaseClass;

import java.util.Objects;

public class Child extends Parent {
    String job;

    public Child(String name, String job) {
        super(name);
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // methods and attributes of parent class have to be the same
        if (!super.equals(o)) return false;

        Child child = (Child) o;

        return Objects.equals(this.job, child.job);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (job != null ? job.hashCode() : 0);
        return result;
    }
}
