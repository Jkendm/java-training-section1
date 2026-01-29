package io.github.jkendm.practice_exercise.javase011;

public class Triangle extends Shape {
    //defining the fields 
    private double base; 
    private double height; 

    //defining the constructor 
    public Triangle(String color, boolean filled, double base, double height){ 
        super(color, filled); 
        this.base=base;
        this.height=height; 
    } 
    //overriding the Abstract and concrete methods
    @Override 
    public double getArea(){ 
        return 0.5 *base * height; 
    }
     @Override
      public double getPerimeter(){
         // Hypotenuse for right triangle
          double hypotenuse = Math.sqrt(base * base + height * height); 
          return hypotenuse + base + height; 
        } 
        @Override
         public String toString() {
             return "Triangle[base=" + base + ", Height = " + height + "," + super.toString() + "]"; 
            }
    
}
