package io.github.jkendm.practice_exercise.javase011;

public class Circle extends Shape {
    //declaring the variables
    private double radius; 

    //defining a constructor 
    public Circle (String color, boolean filled, double radius){
         super(color, filled); 
         this.radius=radius;
         } 
         //override the parent method getArea, getPerimeter and toString 
         // the subclasses provide an implementation for the abstract method
         @Override
          public double getArea(){ 
            return Math.PI *radius*radius;
         } 
         @Override 
         public double getPerimeter(){ 
            return 2 * Math.PI* radius;
         } 
         @Override public String toString() { 
            return "Circle[radius=" + radius + ", " + super.toString() + "]"; 
        }
    
}
