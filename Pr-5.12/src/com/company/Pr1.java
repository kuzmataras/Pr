package com.company;

public class Pr1 {

    public static void main(String[] args) {
        int[] x = new int[25];
        for (int i = 0, y = 1; y < 99; i++, y += 2) {
            x[i] = y;
            System.out.println(x[i]);
        }
    }
}