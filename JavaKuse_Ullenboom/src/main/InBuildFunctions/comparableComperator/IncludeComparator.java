package comparableComperator;

public class IncludeComparator {

    int number;
    int number2;

    // Constructors
    IncludeComparator(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "IncludeComparator{" +
                "number=" + number +
                ", number2=" + number2 +
                '}';
    }
}
