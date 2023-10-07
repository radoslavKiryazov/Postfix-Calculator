package com.example.postfixcalculator.controller;

import com.example.postfixcalculator.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CalculatorController {

    Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }
    @PostMapping("/calculator")
    public ResponseEntity<Integer> evaluateExpression(@RequestBody ArrayList<TokenWrapper> tokenWrappers) {


        int result = calculator.evaluateExpression(parseToTokens(tokenWrappers));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    private ArrayList<Token> parseToTokens(List<TokenWrapper> tokenWrappers) {
        ArrayList<Token> tokens = new ArrayList<>();

        for (TokenWrapper wrapper : tokenWrappers) {
            String type = wrapper.getType();

            if ("operand".equals(type)) {
                Operand operand = wrapper.getOperand();
                tokens.add(operand);
            } else if ("operator".equals(type)) {
                Operator operator = wrapper.getOperator();
                tokens.add(operator);
            } else {
                throw new IllegalArgumentException("Unknown token type: " + type);
            }
        }
        System.out.println(tokens);

        return tokens;
    }
}
