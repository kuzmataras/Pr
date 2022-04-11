package com.company;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = sc.nextInt();
        if (n >= 25 && n <= 100) {
            System.out.print("Число " + n + " міститься в проміжку (25; 100)");
        } else {
            System.out.print("Число " + n + " не міститься в проміжку (25; 100)");
        }
    }
}
