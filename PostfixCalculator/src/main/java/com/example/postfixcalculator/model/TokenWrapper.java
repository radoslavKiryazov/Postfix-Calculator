package com.example.postfixcalculator.model;

public class TokenWrapper {
    private String type;
    private Operand operand;
    private Operator operator;

    public TokenWrapper() {
    }

    public TokenWrapper(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public Operand getOperand() {
        return operand;
    }


    public Operator getOperator() {
        return operator;
    }

}
