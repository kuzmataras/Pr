package com.company;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Щоб погодитись введіть: (Так, ОК, Yes, Y, +, Ok), для відмови введіть: (Ні, NO, N, -, No)");
        String answer = sc.nextLine();
        if ("Так".equals(answer) || "ОК".equals(answer) || "Yes".equals(answer) || "Y".equals(answer) || "+".equals(answer) || "Ok".equals(answer)) {
            System.out.print("Я погоджуюсь!");
        } else if ("Ні".equals(answer) || "NO".equals(answer) || "N".equals(answer) || "-".equals(answer) || "No".equals(answer)) {
            System.out.print("Я відмовляюсь");
        } else {
            System.out.print("Неправильна відповідь!");
        }
    }
}
