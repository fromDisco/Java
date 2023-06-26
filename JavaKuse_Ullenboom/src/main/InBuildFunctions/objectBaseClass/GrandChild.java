package objectBaseClass;

public class GrandChild extends Child {
    double iq;

    public GrandChild(String name, String job, double iq) {
        super(name, job);
        this.iq = iq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GrandChild that = (GrandChild) o;

        return Double.compare(that.iq, iq) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(iq);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
