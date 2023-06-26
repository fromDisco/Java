package iteratorsIterable;

public class Lemming {
    String name;
    String furColor;

    Lemming(String name, String furColor) {
        this.name = name;
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Lemming{" +
                "name='" + name + '\'' +
                ", furColor='" + furColor + '\'' +
                '}';
    }
}
