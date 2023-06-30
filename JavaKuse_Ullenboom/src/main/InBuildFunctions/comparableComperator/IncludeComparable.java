package comparableComperator;

import org.jetbrains.annotations.NotNull;

public class IncludeComparable implements Comparable<IncludeComparable> {
    int number;
    int number2;

    // Constructors
    IncludeComparable(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IncludeComparable that = (IncludeComparable) o;

        return number == that.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public int compareTo(@NotNull IncludeComparable o) {
        return this.number - o.number;
    }

    @Override
    public String toString() {
        return "IncludeComparable{" +
                "number=" + number +
                ", number2=" + number2 +
                '}';
    }
}
