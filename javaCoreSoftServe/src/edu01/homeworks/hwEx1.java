package edu01.homeworks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwEx1 {//HomeworkExercise1 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input circle radius:");
        double r=Integer.parseInt(br.readLine());//radius
        double perimeter=2*r*Math.PI;
        double area=Math.PI*Math.pow(r,2);
        System.out.println("perimeter = "+perimeter+"\narea = "+area);
    }
}
//don`t forget formate your code
