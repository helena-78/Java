package edu04.homeworks;

import java.util.Scanner;

public class NumbersRange {
    public static float getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextFloat();
    }

    public static void main(String[] args) {
        float num1 = getNumber("input first number: ");
        float num2 = getNumber("input second number: ");
        float num3 = getNumber("input third number: ");

        if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5)) {
            System.out.println("all three numbers belong to the range [-5, 5]. ");
        } else {
            System.out.println("not all numbers belong to the range [-5, 5]. ");
        }
    }
}
