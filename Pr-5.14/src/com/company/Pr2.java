package com.company;

import java.util.Scanner;

public class Pr2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String str = sc.nextLine();
        String delimeter = " ";
        String[] subStr_all = str.split(delimeter);
        for (String s : subStr_all) {
            System.out.print(s.charAt(0) + " ");
        }
    }
}

