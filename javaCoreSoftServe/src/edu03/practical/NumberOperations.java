package edu03.practical;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        double num1 = getNumber("input 1st number");
        double num2 = getNumber("input 2nd number");
        double totalSum = getTotal(num1, num2);
        double average = getAverage(num1, num2);
        System.out.println("sum = " + totalSum + "\naverage = " + average);
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);//create inside a method only if the method is static
        System.out.println(prompt);
        return sc.nextDouble();
    }
}
