package expressivo;

import java.util.Objects;

public class NumberExpression implements Expression {
    private final double value;

    public NumberExpression(double value) {
        this.value = value;
        checkRep();
    }

    // Abstraction Function: Represents a numeric expression with the specified
    // value.
    // Rep Invariant: None.
    // Safety from Rep Exposure: Fields are private and final. Expressions are
    // immutable.

    private void checkRep() {
        // No rep invariant for NumberExpression
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject)
            return true;
        if (thatObject == null || getClass() != thatObject.getClass())
            return false;
        NumberExpression that = (NumberExpression) thatObject;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
