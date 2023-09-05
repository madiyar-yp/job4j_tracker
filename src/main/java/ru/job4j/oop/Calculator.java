package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int rslSum = sum(10);
        System.out.println(rslSum);
        Calculator calc = new Calculator();
        int rslMultiply = calc.multiply(5);
        System.out.println(rslMultiply);
        int rslMinus = minus(15);
        System.out.println(rslMinus);
        int rslDivide = calc.divide(20);
        System.out.println(rslDivide);
        int rslSumAll = calc.sumAllOperation(5);
        System.out.println(rslSumAll);
    }
}