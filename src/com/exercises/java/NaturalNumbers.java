package com.exercises.java;

import java.util.Scanner;

public class NaturalNumbers {
    public int calculateSum(int n) {
        int sum = 0;

        for (int i = 0; i <=n; i++)
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        return sum;


    }

    public static void main(String[] args) {
        NaturalNumbers naturalNumbers;
        naturalNumbers = new NaturalNumbers();
        int number = naturalNumbers.calculateSum(10);
        System.out.println("the sum of the natural numbers are are divisible by 3 or 5:" + number);

    }


}









