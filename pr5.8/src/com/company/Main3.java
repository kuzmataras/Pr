package com.company;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число 1 (До верху) або 0 (До низу) - ");
        int a = sc.nextInt();
        if (a == 1){
            System.out.print("Введіть поверх (1 - 9) - ");
            int floor = sc.nextInt();
            if (floor == 1 || floor > 2 && floor <= 9) {
                System.out.print("Ви піднялись на " + floor + " поверх");
            } else if (floor == 2) {
                System.out.print("Ви піднялись на 3 поверх");
            } else {
                System.out.print("Такого поверху не існує!");
            }
        } else {
            System.out.print("Введіть поверх (1 - 9) - ");
            int floor = sc.nextInt();
            if (floor == 1 || floor > 2 && floor <= 9) {
                System.out.print("Ви спустились на " + floor + " поверх");
            } else if (floor == 2) {
                System.out.print("Ви спустились на 1 поверх");
            } else {
                System.out.print("Такого поверху не існує!");
            }
        }
    }
}