package edu03.homeworks;

import java.util.Scanner;

import static java.lang.System.out;

public class TriangleAreaCalculation {
    public static void main(String[] args) {
        double side1 = getNumber("input side 1: ");
        double side2 = getNumber("input side 2: ");
        double side3 = getNumber("input side 3: ");
        out.println("the area of the triangle is " + calculateTriangleArea(side1, side2, side3));
    }

    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        out.println(prompt);
        return sc.nextDouble();
    }

    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double s = 0;
        double area = 0;
        if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side3 + side2) > side1)) {
            s = (side1 + side2 + side3) / 2;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        } else {
            out.println("one side is greater than the sum of the other two sides: triangle does not exist");
        }
        return area;
    }
}
