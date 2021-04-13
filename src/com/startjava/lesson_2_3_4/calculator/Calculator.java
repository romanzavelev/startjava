package com.startjava.lesson_2_3_4.calculator;

public class Calculator {   
    public int calculate(String mathString) {
        String[] arrayMathString = mathString.split(" ");
        switch (arrayMathString[1]) {
            case "+":
                return Integer.parseInt(arrayMathString[0]) + Integer.parseInt(arrayMathString[2]);
            case "*":
                return Integer.parseInt(arrayMathString[0]) * Integer.parseInt(arrayMathString[2]);
            case "/":
                return Integer.parseInt(arrayMathString[0]) / Integer.parseInt(arrayMathString[2]);
            case "^":
                return (int) Math.pow(Integer.parseInt(arrayMathString[0]), Integer.parseInt(arrayMathString[2]));
            case "%":
                return Integer.parseInt(arrayMathString[0]) % Integer.parseInt(arrayMathString[2]);
            default:
                System.out.println("Данная операция не поддерживается");
                return 0;
        }
    }
}
