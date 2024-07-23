package edu01.practical;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        double a,b,division;
        division = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("input b");
        b = Double.parseDouble(sc.nextLine());
        double sum = a+b;
        double subtraction = a-b;
        double multiplication = a*b;
        if (b!=0)
            division = a/b;
        else
            System.out.println("b cannot be null");
        System.out.println("sum = "+sum+"\na-b = "+subtraction+"\nmultiplication = "+multiplication+"\na/b = "+division);
        sc.close();
    }
}
