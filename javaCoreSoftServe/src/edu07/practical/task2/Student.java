package edu07.practical.task2;

public class Student extends Person {
    public static final String TYPE_PERSON = "student";

    public Student() {
        System.out.println("TYPE_PERSON: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
