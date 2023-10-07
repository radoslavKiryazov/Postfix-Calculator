package model;

import stack.Stack;

import java.util.ArrayList;

public class Calculator {
    public int evaluateExpression(ArrayList<Token> tokenList) {
        Stack<Double> stack = new Stack<>();
        for (Token token : tokenList) {
            if (token instanceof Operand) { //check if number
                stack.push(((Operand) token).value);
            } else if (token instanceof Operator) { //check if operation
                char operator = (((Operator) token).sign); // get the operator
                double operand2 = stack.pop(); //pop operand 2
                double operand1 = stack.pop(); //pop operand 1

                double result = applyOperator(operand1, operand2, operator); //execute the calculation
                stack.push(result); //push the result
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
        return (int) Math.round(stack.pop()); //pop the result and parse it to an int
    }

    private double applyOperator(double operand1, double operand2, char operator) {

        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> {
                if (operand2 == 0) {
                    throw new ArithmeticException("division by zero big no no");
                }
                yield operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
