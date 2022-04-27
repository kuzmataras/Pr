package com.company;

public class Pr4 {
    public static void main(String[] args) {

        int result = 1;
        for(int i = 1; i <= 10; i = i +1){
            result = result * i;
            System.out.println(result);


            result = 1;
            i = 1;
        while(i <= 10){
            result = result * i;
            System.out.println(result);
            i = i + 1;
        }
    }
}
}
