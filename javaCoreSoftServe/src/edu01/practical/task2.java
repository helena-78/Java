package edu01.practical;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number");
        double first = Double.parseDouble(sc.nextLine());
        System.out.println("input second number");
        double second = Double.parseDouble(sc.nextLine());
        System.out.println("input third number");
        double third = Double.parseDouble(sc.nextLine());
        double avg = (first+second+third)/3;
        System.out.println("average is "+avg);
        sc.close();
    }
}
