package com.example.postfixcalculator.model;


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
