package com.company;

public class Pr1 {

        public static void main(String[] args) {
        int n1 = 500;
        int n2 = 500;

        while(n1 <= 650){
            System.out.print(n1 + " ");
            n1 += 10;
        }
        System.out.println();
        for(int i = 500; i<=650; i += 10){
            System.out.print(i + " ");
        }
        System.out.println();
        do {
            System.out.print(n2 + " ");
            n2 += 10;
        }
        while (n2 <= 650);
    }
}
