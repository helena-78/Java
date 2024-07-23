package edu01.homeworks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("what is your name?");
        String name = br.readLine();
        System.out.println("where do you live, "+name+"?");
        String address = br.readLine();
        System.out.println("Complete information is: \nname = "+name+"\naddress = "+address);
    }
}
