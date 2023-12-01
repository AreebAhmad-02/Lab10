
package expressivo;

import java.util.Objects;

public class AdditionExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        checkRep();
    }

    // Abstraction Function: Represents the addition of two expressions (left + right).
    // Rep Invariant: Both left and right must be non-null.
    // Safety from Rep Exposure: Fields are private and final. Expressions are immutable.

    private void checkRep() {
        assert left != null : "Left expression cannot be null";
        assert right != null : "Right expression cannot be null";
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        AdditionExpression that = (AdditionExpression) thatObject;
        return left.equals(that.left) && right.equals(that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}


