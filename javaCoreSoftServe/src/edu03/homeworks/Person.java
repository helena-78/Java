package edu03.homeworks;
import static java.lang.System.out;
import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(){
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        return LocalDate.now().getYear() - getBirthYear();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        out.println("input birth year of "+getFirstName()+" "+getLastName());
        setBirthYear(sc.nextInt());
    }

    public void output(){
        out.println("\nFirst Name: "+firstName+", Last Name: "+lastName+", Birth Year: "+birthYear+", age: "+getAge());
    }

    public void changeName(String fn, String ln){
        if(!fn.isEmpty()){
            setFirstName(fn);
        }
        if(!ln.isEmpty()){
            setLastName(ln);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Polina","Avramenko");
        Person person2 = new Person("Max","Hoffman");
        Person person3 = new Person("Piret","Toomet");
        Person person4 = new Person("Anastasiia","Sabolejeva");
        Person person5 = new Person("Elena","Petrova");

        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
