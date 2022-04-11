package com.company;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 10; // 001
        int c = a % 100 / 10; // 010
        int d = a / 100; // 100
        if (((b > c) && (b > d))) {
            System.out.println(b);
        } else if (((c > b) && (c > d))) {
            System.out.println(c);
        } else {
            System.out.print(d);
        }

    }
}