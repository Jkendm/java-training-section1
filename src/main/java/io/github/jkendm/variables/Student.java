package io.github.jkendm.variables;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name; // constructor parameter
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student amara = new Student("Amara", 23);
        System.out.println(amara.getName());
    }

    public int getAge() {
        return age;
    }
}