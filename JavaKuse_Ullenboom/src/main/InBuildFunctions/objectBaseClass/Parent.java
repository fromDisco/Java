package objectBaseClass;

public class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent parent = (Parent) o;

        return this.name != null ? this.name.equals(parent.name) : parent.name == null;
        // return Objects.equals(name, parent.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
