package edu07.practical.task2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "teacher";

    public Teacher() {
        System.out.println("TYPE_PERSON: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary of a " + TYPE_PERSON);
    }
}
