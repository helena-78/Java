package edu05.homeworks;

import java.util.Scanner;

public class DoWhileLoop {
    static Scanner sc = new Scanner(System.in);

    public static int getNumber() {
        return sc.nextInt();
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        do {
            System.out.println("input two integer numbers: ");
            int num1 = getNumber();
            int num2 = getNumber();
            System.out.println("sum = " + sum(num1, num2));
            System.out.println("repeat the task? <yes> <no>");
            sc.nextLine();
        } while (sc.nextLine().equals("yes"));
        sc.close();
    }
}
