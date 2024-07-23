package edu08.hw;

import edu08.practical.Department;

public class Student extends Person implements Cloneable {
    private int courseCode;

    public Student() {
    }

    public Student(FullName fullName, int age, int courseCode) {
        super(fullName, age);
        this.courseCode = courseCode;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String info() {
        return super.info() + ", course code: " + courseCode;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
