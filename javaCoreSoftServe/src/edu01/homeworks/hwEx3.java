package edu01.homeworks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("cost per minute in Denmark:");
        double c1=Integer.parseInt(br.readLine());
        System.out.println("call duration(min):");
        double t1=Integer.parseInt(br.readLine());
        System.out.println("cost per minute in Sweden:");
        double c2=Integer.parseInt(br.readLine());
        System.out.println("call duration(min):");
        double t2=Integer.parseInt(br.readLine());
        System.out.println("cost per minute in Estonia:");
        double c3=Integer.parseInt(br.readLine());
        System.out.println("call duration(min):");
        double t3=Integer.parseInt(br.readLine());
        double cost1=c1*t1;
        double cost2=c2*t2;
        double cost3=c3*t3;
        double total=cost1+cost2+cost3;
        System.out.println("the call cost in Denmark is "+cost1+", "+cost2+" in Sweden and "+cost3+" in Estonia." +
                "The total cost equals "+total+".");
    }
}
