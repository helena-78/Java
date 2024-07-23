package edu01.practical;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input text");
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        System.out.println(third+"\n"+second+"\n"+first);
        sc.close();
    }
}
