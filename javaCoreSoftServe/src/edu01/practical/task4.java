package edu01.practical;
import java.util.Objects;
import java.util.Scanner;


public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how are you?");
        String answer = sc.nextLine();
        System.out.println("you are "+answer);
        sc.close();
    }
}
