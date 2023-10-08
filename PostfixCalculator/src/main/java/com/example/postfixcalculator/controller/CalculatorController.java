package com.example.postfixcalculator.controller;

import com.example.postfixcalculator.model.*;
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

            if (type.equals("operand")) {
                Operand operand = wrapper.getOperand();
                tokens.add(operand);
            } else if (type.equals("operator")) {
                Operator operator = wrapper.getOperator();
                tokens.add(operator);
            } else {
                throw new IllegalArgumentException("unknown token type: " + type);
            }
        }
        System.out.println(tokens);

        return tokens;
    }
}
