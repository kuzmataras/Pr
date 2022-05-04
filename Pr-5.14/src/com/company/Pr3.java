package com.company;

import java.util.Scanner;

public class Pr3 {

    public static void main(String[] args) {
        String arr[] = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a line: ");
            arr[i] = sc.nextLine();
        }
        if(arr[0].length() > arr[1].length()) {
            System.out.println("The first line - is bigger");
        }
        else if(arr[0].length()==arr[1].length()) {
            System.out.println("First line = Second line");
        }
        else{
            System.out.println("The second line - is bigger");
        }
    }
}

