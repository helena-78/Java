package edu08.hw;

import edu08.practical.Department;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student.FullName fullName = student.new FullName("Margorita", "Addams");
        Student student1 = new Student();
        Student.FullName fullName1 = student1.new FullName("Victoria", "Addams");
        student.setFullName(fullName);
        student.setCourseCode(568);
        student.setAge(22);
        student1.setFullName(fullName1);
        student1.setCourseCode(235);
        student1.setAge(18);

        System.out.println(student.info() + ", Activity: " + student.activity());
        System.out.println(student1.info() + ", Activity: " + student1.activity());
        System.out.println("*".repeat(10));

        Student student2 = (Student) student.clone();
        student2.setCourseCode(555);

        System.out.println(student.info() + ", Activity: " + student.activity());
        System.out.println(student1.info() + ", Activity: " + student1.activity());
        System.out.println(student2.info() + ", Activity: " + student1.activity());

    }
}
