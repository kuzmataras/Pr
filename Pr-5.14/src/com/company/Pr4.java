package com.company;
import java.util.Scanner;
public class Pr4 {

    public static void main(String[] args) {
        String firstname, secondName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write first name : ");
        firstname = scanner.nextLine();
        System.out.print("Write second name : ");
        secondName = scanner.nextLine();
        boolean indent = firstname.equalsIgnoreCase(secondName);
        if(indent){
            System.out.print("Names are the same");
        }
        else {
            System.out.print("Names are not the same");
        }
    }
}
