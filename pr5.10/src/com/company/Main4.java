package com.company;

public class Main4 {
    public static void main(String[] args) {
        int n = 10;
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n -= 1;
        }
        System.out.println(fact);
        int factorial = 1;
        int b = 10;
        for (int i = 1; i <= b; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}