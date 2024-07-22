package com.exercises.java;

public class DifferenceCalculator {

    public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;

        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = calculateDifference(n);
        System.out.println("The difference is: " + result);
    }
}