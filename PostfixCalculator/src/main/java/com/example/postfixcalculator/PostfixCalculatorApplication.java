package com.example.postfixcalculator;

import com.example.postfixcalculator.model.Operand;
import com.example.postfixcalculator.model.Operator;
import com.example.postfixcalculator.model.Token;
import com.example.postfixcalculator.model.TokenWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PostfixCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostfixCalculatorApplication.class, args);
    }


}
