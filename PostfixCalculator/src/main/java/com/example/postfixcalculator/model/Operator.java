package com.example.postfixcalculator.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

public class Operator implements Token {
    String sign;
    public Operator(){};
    public Operator(String sign){
        this.sign = sign;
    }
    @Override
    public String toString() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
