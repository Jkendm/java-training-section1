package io.github.jkendm.assignment;
// Grade assignment in the notes

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        //Scanner.nextLine(); // Clear 

        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your Grade: ");
        char grade = scanner.next().charAt(0);

        System.out.println("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("============Student Information=============:");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
        System.out.println("Student GPA: " + gpa);

        //close the scanner
        scanner.close();

    }
}
