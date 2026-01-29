package io.github.jkendm.practice_exercise.javase011;

public class Main {
    public static void main(String[] args) { 
        //Practice Exercise 1

        //Abstract classes can't create the objects directly, not instantiated with new keyword
        Shape circle = new Circle("Red", false, 10); 
        Shape rectangle = new Rectangle("Blue", true, 15, 14); 
        Shape triangle = new Triangle("Maroon", true, 10, 50); 

        Shape[] shape = {circle, rectangle, triangle};
         // Polymorphic behavior - loop through array 
         for (Shape s : shape) { 
            System.out.println(s.toString());
             System.out.println("Area: " + s.getArea()); 
             System.out.println("Perimeter: " + s.getPerimeter()); 
             System.out.println(); } 
            

            //Practice exercise 2
            //creating an object
            Employee manager= new Manager("Kendi", "38435", 100000,"Database");
            Employee developer = new Developer("Murithi", "42598",150000,"Python");
            Employee intern = new Intern("Sonnie","56908",90000,"JKUAT");

            //defining an array
            Employee[] employee = {manager,developer,intern};
            // Looping
            for (Employee e:employee){
                e.calculateBonus();
                e.displayInfo(); }
            }
        }

