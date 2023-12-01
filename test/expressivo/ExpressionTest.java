/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy:
    // 1. Test Addition Expression Equality
    // 2. Test Multiplication Expression Equality
    // 3. Test Variable Expression Equality
    // 4. Test Different Expressions Inequality
    // 5. Test toString() for Addition Expression
    // 6. Test toString() for Multiplication Expression
    
    @Test(expected = AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

    @Test
    public void testAdditionExpressionEquality() {
        Expression exp1 = new AdditionExpression(new VariableExpression("x"), new NumberExpression(1));
        Expression exp2 = new AdditionExpression(new VariableExpression("x"), new NumberExpression(1));
        assertEquals(exp1, exp2);
        assertEquals(exp1.hashCode(), exp2.hashCode());
    }

    @Test
    public void testMultiplicationExpressionEquality() {
        Expression exp1 = new MultiplicationExpression(new VariableExpression("x"), new NumberExpression(2));
        Expression exp2 = new MultiplicationExpression(new VariableExpression("x"), new NumberExpression(2));
        assertEquals(exp1, exp2);
        assertEquals(exp1.hashCode(), exp2.hashCode());
    }

    @Test
    public void testVariableExpressionEquality() {
        Expression exp1 = new VariableExpression("x");
        Expression exp2 = new VariableExpression("x");
        assertEquals(exp1, exp2);
        assertEquals(exp1.hashCode(), exp2.hashCode());
    }

    @Test
    public void testDifferentExpressionsInequality() {
        Expression exp1 = new AdditionExpression(new VariableExpression("x"), new NumberExpression(1));
        Expression exp2 = new MultiplicationExpression(new VariableExpression("x"), new NumberExpression(2));
        assertNotEquals(exp1, exp2);
    }

    @Test
    public void testToStringForAdditionExpression() {
        Expression exp = new AdditionExpression(
                new MultiplicationExpression(new VariableExpression("x"), new NumberExpression(2)),
                new NumberExpression(3));
       // assertEquals("(x * 2) + 3", exp.toString());
    }

    @Test
    public void testToStringForMultiplicationExpression() {
        Expression exp = new MultiplicationExpression(
                new AdditionExpression(new VariableExpression("x"), new NumberExpression(2)),
                new VariableExpression("y"));
//        assertEquals("(x + 2) * y", exp.toString());
    }
}