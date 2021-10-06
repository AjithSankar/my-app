package com.demo;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3,5));
        System.out.println(calc.multiply(3,5));
    }
}
