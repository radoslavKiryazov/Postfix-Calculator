package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    ArrayList<Token> tokens;

    @BeforeEach
    public void SetUp(){
        calculator = new Calculator();
        tokens = new ArrayList<>();
    }

    @Test
    public void testValidExpression() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(3.0));
        tokens.add(new Operator('+'));

        tokens.add(new Operand(2.0));
        tokens.add(new Operator('*'));

        tokens.add(new Operand(4.0));
        tokens.add(new Operator('/'));


        int result = calculator.evaluateExpression(tokens);
        assertEquals(4, result);
    }
    @Test
    public void testInvalidExpression() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(3.0));
        // Missing operator, should throw an exception
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression(tokens));
    }


    //Testing the operations.

    @Test
    public void testAdditionOperation() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(3.0));
        tokens.add(new Operator('+'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(8, result);
    }
    @Test
    public void testSubtractionOperation() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(3.0));
        tokens.add(new Operator('-'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(2, result);
    }
    @Test
    public void testMultiplicationOperation() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(3.0));
        tokens.add(new Operator('*'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(15, result);
    }
    @Test
    public void testDivisionOperation() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(6.0));
        tokens.add(new Operand(2.0));
        tokens.add(new Operator('/'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(3, result);
    }
    @Test
    public void testInvalidOperator() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(3.0));
        tokens.add(new Operator('%'));
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression(tokens));
    }
    @Test
    public void testDivisionByZero() {
        //assertTrue(1 == 0);
        tokens.add(new Operand(5.0));
        tokens.add(new Operand(0.0));
        tokens.add(new Operator('/'));
        // Division by zero should throw an exception
        assertThrows(ArithmeticException.class, () -> calculator.evaluateExpression(tokens));
    }
}