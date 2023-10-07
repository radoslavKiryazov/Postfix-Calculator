package com.example.postfixcalculator.model;


import com.fasterxml.jackson.annotation.JsonTypeName;

public class Operand implements Token {

    double value;
    public Operand(){};
    public Operand(double value){
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
