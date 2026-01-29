package io.github.jkendm.practice_exercise.javase011;

public class Rectangle extends Shape{

    //defining the fields 
    private double width; 
    private double height;

     //defining the constructor 
     public Rectangle(String color, boolean filled, double width, double height){ 
        super(color, filled); this.width=width; this.height=height; 
    } 
    //overriding the Abstract and concrete methods
    @Override 
    public double getArea(){ 
        return width * height;
     } 
     @Override
      public double getPerimeter(){ 
        return 2 * (width + height); 
    } 
    @Override 
    public String toString() { 
        return "Rectangle[width=" + width + ", Height = " + height + "," + super.toString() + "]"; 
    }

    
}
