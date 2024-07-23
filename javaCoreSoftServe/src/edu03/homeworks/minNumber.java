package edu03.homeworks;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setErr;

public class minNumber {
    public static void main(String[] args) {
        int num1 = getNumber("input the first number: ");
        int num2 = getNumber("input the second number: ");
        int num3 = getNumber("input the third number: ");
        out.println("the smallest number is "+minNumber(num1,num2,num3));
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        out.println(prompt);
        return sc.nextInt();
    }

    public static int minNumber(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;
    }
}
