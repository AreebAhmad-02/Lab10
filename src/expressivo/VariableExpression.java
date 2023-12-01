package expressivo;

import java.util.Objects;

public class VariableExpression implements Expression {
    private final String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
        checkRep();
    }

    // Abstraction Function: Represents a variable expression with the specified variable name.
    // Rep Invariant: Variable name must be non-null.
    // Safety from Rep Exposure: Fields are private and final. Expressions are immutable.

    private void checkRep() {
        assert variable != null : "Variable name cannot be null";
    }

    @Override
    public String toString() {
        return variable;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        VariableExpression that = (VariableExpression) thatObject;
        return variable.equals(that.variable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable);
    }
    
}
